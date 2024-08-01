package org.example.low_level_design.lld1.lld27_06_2024;

public class Subtractor implements Runnable {

   @Override
   public void run () {
	  System.out.println ("Subtractor"+ScalerThread.currentThread ().getName ());
   }
}
