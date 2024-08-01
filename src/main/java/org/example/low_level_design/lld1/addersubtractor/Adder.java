package org.example.low_level_design.lld1.addersubtractor;

public class Adder implements Runnable{
   private Counter count;

   public Adder(Counter count) {
	  this.count = count;
   }
   @Override
   public void run() {
	  for (int i = 1; i <=10000; i++) {
		 count.value+=i;
	  }
   }
}
