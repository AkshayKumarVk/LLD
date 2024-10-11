package org.example.low_level_design.tests.concorrency;

public class NumberPrinter implements Runnable {

   private int i;

   public NumberPrinter (int i) {
	  this.i=i;
   }

   @Override
   public void run(){
	  System.out.println (i+ " " + Thread.currentThread ().getName());
   }
}
