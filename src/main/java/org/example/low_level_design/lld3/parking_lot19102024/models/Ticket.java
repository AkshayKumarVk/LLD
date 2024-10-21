package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter

public class Ticket extends BaseModel {
   private String number;
   private Date entryTime;
   private Operator generatedBy;
   private Gate entryGate;
   private Vehicle vehicle;
   private ParkingSpot parkingSpot;
}
