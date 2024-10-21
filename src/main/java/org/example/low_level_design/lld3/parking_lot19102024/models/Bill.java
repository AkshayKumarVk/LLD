package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter

public class Bill extends BaseModel {
   private int number;
   private Ticket ticket;
   private List<Payment> paymentList;
   private Long amount;
   private BillStatus status;
   private Gate gate;
   private Date exitTime;
   private FeeCalculationStrategyType feeCalculationStrategyType;
}
