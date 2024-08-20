package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel {

   private String name;
   private String address;
   private List<ParkingFloor> parkingFloors;
   private ParkingLotStatus parkingLotStatus;
   private List<Gate> gates;
   private List<VehicleType> vehicleTypes;
   private SpotAssignmentStrategyType spotAssignmentStrategyType;
   private FeeCalculationStrategyType feeCalculationStrategyType;

}
