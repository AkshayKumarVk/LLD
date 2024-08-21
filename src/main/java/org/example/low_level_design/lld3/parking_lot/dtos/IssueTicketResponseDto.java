package org.example.low_level_design.lld3.parking_lot.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.parking_lot.models.Ticket;

@Getter
@Setter
public class IssueTicketResponseDto {
   private Ticket ticket;
   private ResponseStatus responseStatus;
}
