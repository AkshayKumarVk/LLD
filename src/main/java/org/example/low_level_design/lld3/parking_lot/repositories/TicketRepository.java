package org.example.low_level_design.lld3.parking_lot.repositories;

import org.example.low_level_design.lld3.parking_lot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
   private Map<Long, Ticket> ticketMap = new TreeMap<> ();
   private Long previousId=0L;

   public Ticket save (Ticket ticket) {
	  if (ticket.getId () == null) {
		 ticket.setId (++previousId);
	  }
	  ticketMap.put (ticket.getId (), ticket);
	  return ticket;
   }

   public Ticket getTicketById (Long id) {
	  return ticketMap.get (id);
   }

}
