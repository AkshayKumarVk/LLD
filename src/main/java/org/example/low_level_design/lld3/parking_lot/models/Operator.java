package org.example.low_level_design.lld3.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel{
	private String name;
	private Long employeeId;
}
