package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Vehicle extends BaseModel {
   private String regNO;
   private String ownerName;
   private VehicleType type;

   public Vehicle (String regNO, String ownerName, VehicleType type) {
	  this.regNO = regNO;
	  this.ownerName = ownerName;
	  this.type = type;
   }

}
