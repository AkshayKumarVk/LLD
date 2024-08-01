package org.example.low_level_design.lld1.lld27_06_2024;

public class Adder implements  Runnable{
   @Override
   public void run () {
	  System.out.println ("I am the Adder class	"+Thread.currentThread ().getName () );
   }
}
