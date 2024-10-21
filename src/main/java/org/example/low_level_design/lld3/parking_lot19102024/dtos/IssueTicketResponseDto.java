package org.example.low_level_design.lld3.parking_lot19102024.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.parking_lot19102024.models.Ticket;

@Getter
@Setter

public class IssueTicketResponseDto {
   private Ticket ticket;
   private ResponseStatus status;
}
