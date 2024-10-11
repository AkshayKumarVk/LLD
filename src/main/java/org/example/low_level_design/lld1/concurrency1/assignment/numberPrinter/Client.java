package org.example.low_level_design.lld1.concurrency1.assignment.numberPrinter;

import org.springframework.aop.ThrowsAdvice;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
   public static void main (String[] args) {
//	  numberPrinter();
	  numberPrinter2();
   }

   public static void numberPrinter2 () {

	  Queue< Integer > queue = new ConcurrentLinkedQueue<> ();

	  for (int i = 1; i <= 100; i++) {
		 queue.add(i);
	  }

	  for (int i = 1; i <= 20; i++) {
		 new Thread (new NumberPrinter2 (queue,i)).start ();
	  }
   }

   private static void numberPrinter () {

	  for (int i = 1; i<= 100; i++){
		 Thread thread = new Thread (new NumberPrinter (i));
		 thread.start ();
	  }
   }
}
