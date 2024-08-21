package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel {

   private Gate entryGate;
   private String ticketNumber;
   private Date entryTime;
   private ParkingSpot parkingSpot;
   private Vehicle vehicle;
   private Operator generatedBy;

}
