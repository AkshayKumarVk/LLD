package org.example.low_level_design.lld1.concurrency1.assignment;

public class Adder implements Runnable{

   @Override
   public void run(){
	  System.out.println("I am the Adder class");
   }
}