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
   private Vehicle vehicle;
   private ParkingSpot parkingSpot;
   private List<Payment> paymentList;
   private Bill bill;
   private Gate exitGate;
}
