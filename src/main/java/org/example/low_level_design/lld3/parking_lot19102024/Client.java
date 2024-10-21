package org.example.low_level_design.lld3.parking_lot19102024;

import org.example.low_level_design.lld3.parking_lot19102024.controllers.TicketController;
import org.example.low_level_design.lld3.parking_lot19102024.dtos.IssueTicketRequestDto;
import org.example.low_level_design.lld3.parking_lot19102024.dtos.IssueTicketResponseDto;
import org.example.low_level_design.lld3.parking_lot19102024.exceptions.GateNotFoundException;
import org.example.low_level_design.lld3.parking_lot19102024.exceptions.ParkingSpotNotAvailableException;
import org.example.low_level_design.lld3.parking_lot19102024.models.VehicleType;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.GateRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.ParkingLotRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.TicketRepository;
import org.example.low_level_design.lld3.parking_lot19102024.repositories.VehicleRepository;
import org.example.low_level_design.lld3.parking_lot19102024.services.TicketService;

public class Client {
   public static void main (String[] args) throws ParkingSpotNotAvailableException, GateNotFoundException {

	  TicketRepository ticketRepository = new TicketRepository ();
	  ParkingLotRepository parkingLotRepository = new ParkingLotRepository ();
	  VehicleRepository vehicleRepository = new VehicleRepository ();
	  GateRepository gateRepository = new GateRepository ();

	  TicketService ticketService = new TicketService (gateRepository,
			  vehicleRepository,
			  parkingLotRepository,
			  ticketRepository);

	  TicketController ticketController = new TicketController (ticketService);
	  IssueTicketRequestDto requestDto = new IssueTicketRequestDto ();

	  requestDto.setGateId (1234L);
	  requestDto.setOwnerName ("Akshay Kumar");
	  requestDto.setRegNo ("KL131234");
	  requestDto.setVehicleType (VehicleType.CAR);

	  IssueTicketResponseDto responseDto = ticketController.issueTicket (requestDto);

	  System.out.println (responseDto.toString ());
   }
}
