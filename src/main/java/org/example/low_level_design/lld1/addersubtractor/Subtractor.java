package org.example.low_level_design.lld1.addersubtractor;

public class Subtractor implements  Runnable{
   private Counter counter;

   public Subtractor(Counter counter){
	  this.counter=counter;
   }

   @Override
   public void run(){
	  for (int i = 1; i <=10000; i++) {
		 counter.value-=i;
	  }
   }
}
