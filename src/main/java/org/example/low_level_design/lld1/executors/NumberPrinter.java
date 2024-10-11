package org.example.low_level_design.lld1.executors;

public class NumberPrinter implements Runnable {
   private final int number;

   public NumberPrinter (int number) {
	  this.number = number;
   }

   @Override
   public void run () {
	  System.out.println (number + " by " + Thread.currentThread ().getName ());
   }
}
