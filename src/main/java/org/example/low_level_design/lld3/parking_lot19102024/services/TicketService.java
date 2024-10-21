package org.example.low_level_design.lld3.parking_lot19102024.services;

import org.example.low_level_design.lld3.parking_lot19102024.exceptions.GateNotFoundException;
import org.example.low_level_design.lld3.parking_lot19102024.exceptions.ParkingSpotNotAvailableException;
import org.example.low_level_design.lld3.parking_lot19102024.models.*;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.GateRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.ParkingLotRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.TicketRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.VehicleRepository;
import org.example.low_level_design.lld3.parking_lot19102024.services.factories.SpotAssignmentStrategyFactory;
import org.example.low_level_design.lld3.parking_lot19102024.services.strategies.spotAssignmentStrategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
   private final GateRepository gateRepository;
   private final VehicleRepository vehicleRepository;
   private final ParkingLotRepository parkingLotRepository;
   private final TicketRepository ticketRepository;

   public TicketService (GateRepository gateRepository,
						 VehicleRepository vehicleRepository,
						 ParkingLotRepository parkingLotRepository,
						 TicketRepository ticketRepository) {

	  this.gateRepository = gateRepository;
	  this.vehicleRepository = vehicleRepository;
	  this.parkingLotRepository = parkingLotRepository;
	  this.ticketRepository = ticketRepository;
   }

   public Ticket issueTicket (Long gateId,
							  String ownerName,
							  String regNo,
							  VehicleType vehicleType) throws GateNotFoundException,
																	  ParkingSpotNotAvailableException {

	  Ticket ticket = new Ticket ();
	  ticket.setEntryTime (new Date ());

	  // Check if gate is present in the gate repository
	  Optional<Gate> optionalGate = gateRepository.findGateById (gateId);

	  if (optionalGate.isEmpty ()) {
		 gateRepository.save (optionalGate.get ());
		 throw new GateNotFoundException ("There is no gate with " + gateId);
	  }

	  Gate entryGate = optionalGate.get ();
	  // Check if gate is present in the gate repository


	  ticket.setEntryGate (entryGate);
	  ticket.setGeneratedBy (entryGate.getOperator ());

	  // Check if vehicle is present in the vehicle repository
	  Vehicle savedVehicle = vehicleRepository.findVehicleByRegNO (regNo);

	  if (savedVehicle == null) {
		 vehicleRepository.save (new Vehicle (
				 regNo,
				 ownerName,
				 vehicleType
		 ));
	  }
	  ticket.setVehicle (savedVehicle);
	  ticket.setNumber (new Date () + ownerName.toLowerCase ());
	  // Check if vehicle is present in the vehicle repository

	  //get parking lot
//	  Long parkingLot
	  //get parking lot

	  ParkingLot parkingLot = parkingLotRepository.findParkingLotByGateId (gateId);
	  if (parkingLot == null) {
		 throw new RuntimeException ("Invalid parking lot or gate id");
	  }

	  SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.
															  getSpotAssignStrategy (
																	  parkingLot.getSpotAssignmentStrategyType ()
															  );

	  ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot (vehicleType);
	  if (parkingSpot.getStatus ().equals (ParkingSpotStatus.FULL)) {
		 throw new ParkingSpotNotAvailableException ("Parking is full");
	  }

	  ticket.setParkingSpot (parkingSpot);

	  return ticketRepository.save (ticket);
   }
}
