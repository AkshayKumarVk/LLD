package org.example.low_level_design.lld2.factory.ebill;

public class DomesticPlan extends Plan {

   @Override
   public void getRate () {
	 this.rate = 3.50;
   }
}
