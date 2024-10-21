package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.parking_lot.models.ParkingFloorStatus;

import java.util.List;

@Getter
@Setter

public class Floor extends BaseModel {
   private Long number;
   private List<ParkingSpot> parkingSpotList;
   private ParkingFloorStatus status;
}
