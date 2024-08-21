package org.example.low_level_design.lld3.parking_lot.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.parking_lot.models.VehicleType;

@Getter
@Setter
public class IssueTicketRequestDto {
   private Long gateId;
   private String registrationNumber;
   private String ownerName;
   private VehicleType vehicleType;

}
