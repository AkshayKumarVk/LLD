package org.example.low_level_design.lld1.concurrency1.assignment.numberPrinter;

import ch.qos.logback.classic.pattern.ThrowableHandlingConverter;

import java.util.Queue;

public class NumberPrinter2 implements Runnable {
   private Queue queue;
   private int name;

   public  NumberPrinter2 (Queue queue, int name) {
	  this.queue=queue;
	  this.name=name;
   }

   public  void  run(){
	  while (true) {
		 if (!queue.isEmpty ()) {
			queue.remove ();
			System.out.println (this.name + " " + Thread.currentThread().getName());
		 }
	  }
   }
}
