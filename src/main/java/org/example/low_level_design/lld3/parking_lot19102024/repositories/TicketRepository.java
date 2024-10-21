package org.example.low_level_design.lld3.parking_lot19102024.repositories;

import org.example.low_level_design.lld3.parking_lot19102024.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
   private Map<Long, Ticket> ticketMap = new HashMap<> ();
   private Long previousId;

   public Ticket save (Ticket ticket) {
	  if (ticket.getId () == null) {
		 ticket.setId (++previousId);
	  }
	  return ticketMap.put (ticket.getId (), ticket);
   }
}
