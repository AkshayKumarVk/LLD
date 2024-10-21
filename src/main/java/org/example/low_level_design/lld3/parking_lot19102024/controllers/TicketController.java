package org.example.low_level_design.lld3.parking_lot19102024.controllers;

import org.example.low_level_design.lld3.parking_lot19102024.dtos.IssueTicketRequestDto;
import org.example.low_level_design.lld3.parking_lot19102024.dtos.IssueTicketResponseDto;
import org.example.low_level_design.lld3.parking_lot19102024.dtos.ResponseStatus;
import org.example.low_level_design.lld3.parking_lot19102024.exceptions.GateNotFoundException;
import org.example.low_level_design.lld3.parking_lot19102024.exceptions.ParkingSpotNotAvailableException;
import org.example.low_level_design.lld3.parking_lot19102024.models.Ticket;
import org.example.low_level_design.lld3.parking_lot19102024.services.TicketService;

public class TicketController {
   private final TicketService ticketService;

   public TicketController (TicketService ticketService) {
	  this.ticketService = ticketService;
   }

   public IssueTicketResponseDto issueTicket (IssueTicketRequestDto requestDto) throws GateNotFoundException,
																							   ParkingSpotNotAvailableException {
	  IssueTicketResponseDto responseDto = new IssueTicketResponseDto ();

	  try {
		 Ticket ticket = ticketService.issueTicket (
				 requestDto.getGateId (),
				 requestDto.getOwnerName (),
				 requestDto.getRegNo (),
				 requestDto.getVehicleType ()
		 );

		 responseDto.setTicket (ticket);
		 responseDto.setStatus (ResponseStatus.SUCCESS);
	  } catch(Exception e){
		 responseDto.setStatus (ResponseStatus.FAILED);
	  }

	  return responseDto;
   }
}
