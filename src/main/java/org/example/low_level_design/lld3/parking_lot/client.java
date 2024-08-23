package org.example.low_level_design.lld3.parking_lot;

import org.example.low_level_design.lld3.parking_lot.controllers.TicketController;
import org.example.low_level_design.lld3.parking_lot.dtos.IssueTicketRequestDto;
import org.example.low_level_design.lld3.parking_lot.dtos.IssueTicketResponseDto;
import org.example.low_level_design.lld3.parking_lot.models.VehicleType;
import org.example.low_level_design.lld3.parking_lot.repositories.*;
import org.example.low_level_design.lld3.parking_lot.services.TicketService;

public class client {

   private static final GateRepository gateRepository = new GateRepository ();
   private static final ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository ();
   private static final ParkingLotRepository parkingLotRepository = new ParkingLotRepository ();
   private static final ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository ();
   private static final TicketRepository ticketRepository = new TicketRepository ();
   private static final VehicleRepository vehicleRepository = new VehicleRepository ();

   private static final TicketService ticketService = new TicketService (
		   gateRepository,
		   parkingFloorRepository,
		   parkingLotRepository,
		   parkingSpotRepository,
		   ticketRepository,
		   vehicleRepository);

   public static void main (String[] args) {

	  demoIssueTicket ();
   }

   private static void demoIssueTicket () {

	  IssueTicketRequestDto issueTicketRequestDto = new IssueTicketRequestDto ();
	  issueTicketRequestDto.setGateId (1L);
	  issueTicketRequestDto.setOwnerName ("Akshay Kumar");
	  issueTicketRequestDto.setRegistrationNumber ("KL13AB0344");
	  issueTicketRequestDto.setVehicleType (VehicleType.FOUR_WHEELER);

	  TicketController ticketController = new TicketController (ticketService);

	  IssueTicketResponseDto issueTicketResponseDto =
			  ticketController.issueTicket (issueTicketRequestDto);
	  System.out.println ("Debug");

	  System.out.println (issueTicketResponseDto.getTicket ());
   }
}
