package org.example.low_level_design.lld3.parking_lot19102024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public abstract class BaseModel {
   private Long id;
   private Date GeneratedAt;
   private Date updatedAt;
}
