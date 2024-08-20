package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{

   private Long amount;
   private PaymentStatus paymentStatus;
   private String transactionId;
   private PaymentMode paymentMode;
   private Bill bill;
   private Date paymentTime;
}
