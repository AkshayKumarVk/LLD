package org.example.low_level_design.lld1.generic.generic_method;

public class GenericPair <T,U>{
   T value;
   U anotherValue;

   public GenericPair (T i, U ajf) {
	  this.value = i;
	  this.anotherValue = ajf;
   }

   public static <V >void fun(V value){
	  System.out.println (value);
   }
}
