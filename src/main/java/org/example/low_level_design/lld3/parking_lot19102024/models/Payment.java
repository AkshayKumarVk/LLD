package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter

public class Payment extends BaseModel {
	private Long amount;
	private PaymentType paymentType;
	private Date time;
	private String referenceNo;
}
