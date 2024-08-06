package org.example.low_level_design.lld2.class3_factory.ebill;

public abstract class Plan {
   protected double rate;

   abstract void getRate ();

   public void calculateBill (int unit) {
	  System.out.println (unit * this.rate);
   }

}
