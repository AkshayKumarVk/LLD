package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ParkingSpot extends BaseModel {
   private String number;
   private List<VehicleType> supportedVehicleTypeList;
   private ParkingSpotStatus status;
}
