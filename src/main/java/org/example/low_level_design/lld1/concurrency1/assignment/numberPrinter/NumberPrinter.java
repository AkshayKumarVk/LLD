package org.example.low_level_design.lld1.concurrency1.assignment.numberPrinter;

import java.lang.annotation.Inherited;

public class NumberPrinter implements Runnable {
   private int number;

   public  NumberPrinter(int number){
	  this.number=number;
   }

   @Override
   public void run(){
	  System.out.println (number + " " + Thread.currentThread ().getName ());
   }
}
