package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseModel{

   private String registrationNumber;
   private String ownerName;
   private VehicleType vehicleType;
}
