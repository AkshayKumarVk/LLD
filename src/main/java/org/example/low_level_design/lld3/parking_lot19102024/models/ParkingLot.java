package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ParkingLot extends BaseModel {
   private Address address;
   private List<Floor> floorLIst;
   private ParkingLotStatus status;
   private List<VehicleType> supportedVehicles;
   private List<Gate> gateList;
   private FeeCalculationStrategyType feeCalculationStrategyType;
   private SpotAssignmentStrategyType spotAssignmentStrategyType;
}
