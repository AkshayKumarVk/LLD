package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseModel {
   private int floorNumber;
   private ParkingFloor parkingFloor;
   private List<ParkingSpot> parkingSpots;
}
