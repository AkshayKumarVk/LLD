package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Gate extends BaseModel {
   private String number;
   private Operator operator;
   private GateType gateType;
   private GateStatus status;
}
