package org.example.low_level_design.lld1.concurrency1.assignment;

public class Subtractor implements Runnable{

   @Override
   public void run(){
	  System.out.println("I am the Subtractor class");
   }
}