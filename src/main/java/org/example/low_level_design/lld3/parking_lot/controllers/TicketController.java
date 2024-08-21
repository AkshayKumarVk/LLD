package org.example.low_level_design.lld3.parking_lot.controllers;

import org.example.low_level_design.lld3.parking_lot.dtos.IssueTicketRequestDto;
import org.example.low_level_design.lld3.parking_lot.dtos.IssueTicketResponseDto;
import org.example.low_level_design.lld3.parking_lot.dtos.ResponseStatus;
import org.example.low_level_design.lld3.parking_lot.exceptions.GateNotFoundException;
import org.example.low_level_design.lld3.parking_lot.models.Ticket;
import org.example.low_level_design.lld3.parking_lot.services.TicketService;

public class TicketController {
   private final TicketService ticketService;

   public TicketController (TicketService ticketService) {
	  this.ticketService = ticketService;
   }

   public IssueTicketResponseDto issueTicket (IssueTicketRequestDto issueTicketRequestDto) {
	  IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto ();
	  try {
		 Ticket ticket = ticketService.issueTicket (issueTicketRequestDto.getGateId (),
				 issueTicketRequestDto.getRegistrationNumber (),
				 issueTicketRequestDto.getVehicleType (),
				 issueTicketRequestDto.getOwnerName ());
		 issueTicketResponseDto.setTicket (ticket);
		 issueTicketResponseDto.setResponseStatus (ResponseStatus.SUCCESS);
	  } catch (GateNotFoundException e) {
		 System.out.println (e.getMessage ());
		 issueTicketResponseDto.setResponseStatus (ResponseStatus.FAILED);
	  }
	  return issueTicketResponseDto;
   }
}
