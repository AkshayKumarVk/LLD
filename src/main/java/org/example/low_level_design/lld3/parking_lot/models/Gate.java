package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseModel {

   private GateType gateType;
   private GateStatus gateStatus;
   private ParkingLot parkingLot;
   private Operator operator;
}
