package org.example.low_level_design.lld3.parking_lot.services;

import org.example.low_level_design.lld3.parking_lot.exceptions.GateNotFoundException;
import org.example.low_level_design.lld3.parking_lot.models.*;
import org.example.low_level_design.lld3.parking_lot.repositories.*;
import org.example.low_level_design.lld3.parking_lot.services.factories.SpotAssignmentStrategyFactory;
import org.example.low_level_design.lld3.parking_lot.services.strategies.fee_calculation_strategy.FeeCalculationStrategy;
import org.example.low_level_design.lld3.parking_lot.services.strategies.spot_assignment_strategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
   private GateRepository gateRepository;
   private ParkingFloorRepository parkingFloorRepository;
   private ParkingLotRepository parkingLotRepository;
   private ParkingSpotRepository parkingSpotRepository;
   private TicketRepository ticketRepository;
   private VehicleRepository vehicleRepository;

   public TicketService (GateRepository gateRepository,
						 ParkingFloorRepository parkingFloorRepository,
						 ParkingLotRepository parkingLotRepository,
						 ParkingSpotRepository parkingSpotRepository,
						 TicketRepository ticketRepository,
						 VehicleRepository vehicleRepository) {
	  this.gateRepository = gateRepository;
	  this.parkingFloorRepository = parkingFloorRepository;
	  this.parkingLotRepository = parkingLotRepository;
	  this.parkingSpotRepository = parkingSpotRepository;
	  this.ticketRepository =ticketRepository;
	  this.vehicleRepository=vehicleRepository;
   }


   public Ticket issueTicket (Long gateId,
							  String registrationNumber,
							  VehicleType vehicleType,
							  String ownerName)throws  GateNotFoundException {
	  Ticket ticket = new Ticket ();
	  ticket.setEntryTime (new Date ());

//	  Enter to the Parking Lot> 1st gate
//	  find Gate By id
	  Optional<Gate> optionalEntryGate = gateRepository.findGateById (gateId);
	  if (optionalEntryGate.isEmpty ()) {
		 throw new GateNotFoundException ("Gate not found"+ gateId);
	  }

	  Gate entryGate =optionalEntryGate.get ();
	  ticket.setEntryGate (entryGate);
	  ticket.setGeneratedBy (entryGate.getOperator ());

//	  Get vehicle details if present else create new
	  Vehicle savedVehicle = vehicleRepository.getVehicleByRegistrationNumber (registrationNumber);

	  if (savedVehicle == null) {
		 Vehicle vehicle=new Vehicle ();
		 vehicle.setRegistrationNumber (registrationNumber);
		 vehicle.setOwnerName (ownerName);
		 vehicle.setVehicleType (vehicleType);
		 savedVehicle = vehicleRepository.save (vehicle);
	  }
		ticket.setVehicle (savedVehicle);

//	  Get Parking Spot
	  Long parkingLotId= entryGate.getParkingLot ().getId ();
	  ParkingLot parkingLot = parkingLotRepository.findParkingLotById (parkingLotId);

	  FeeCalculationStrategyType feeCalculationStrategyType=
			  parkingLot.getFeeCalculationStrategyType ();
	  SpotAssignmentStrategyType spotAssignmentStrategyType=
			  parkingLot.getSpotAssignmentStrategyType ();


	  SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy (spotAssignmentStrategyType);

	  ticket.setParkingSpot (spotAssignmentStrategy.assignSpot (vehicleType));
	  ticket.setTicketNumber ("ABC123");
	  return ticketRepository.save (ticket);
   }
}
