package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel {
   private String spotNumber;
   private ParkingSpotStatus parkingSpotStatus;
   private List<VehicleType> vehicleTypes;
   private Long parkingFloorId;
}
