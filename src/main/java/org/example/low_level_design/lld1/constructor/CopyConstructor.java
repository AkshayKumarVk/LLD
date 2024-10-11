package org.example.low_level_design.lld1.constructor;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CopyConstructor {
   private int age;
   private String name;

   public CopyConstructor(int age, String name){
	  this.age=age;
	  this.name = name;
   }

   public CopyConstructor(CopyConstructor copyConstructor){
	  this.name= copyConstructor.name;
	  this.age=copyConstructor.age;
   }
}
