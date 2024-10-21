package org.example.low_level_design.lld3.parking_lot19102024.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.parking_lot19102024.models.Vehicle;
import org.example.low_level_design.lld3.parking_lot19102024.models.VehicleType;

@Getter
@Setter

public class IssueTicketRequestDto {
   private Long gateId;
   private String regNo;
   private VehicleType vehicleType;
   private String ownerName;
}
