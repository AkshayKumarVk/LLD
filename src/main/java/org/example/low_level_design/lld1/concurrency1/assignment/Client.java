package org.example.low_level_design.lld1.concurrency1.assignment;

public class Client{
   public static void main(String [] args){
	  System.out.println("I am the main class");

	  Adder a= new Adder();
	  Subtractor s=new Subtractor();

	  Thread t1= new ScalerThread(a);
	  Thread t2= new ScalerThread(s);

	  t1.start();
	  t2.start();
   }
}