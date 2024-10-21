package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Vehicle extends BaseModel {
   private String regNO;
   private String ownerName;
   private VehicleType type;
}
