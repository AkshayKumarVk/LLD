package org.example.low_level_design.lld1.semaphore.producer_consumer.semaphore_solution;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
   private final Queue<Object> queue;
   private final String name;
   private final Semaphore producerSemaphore;
   private final Semaphore consumerSemaphore;


   public Producer (Queue<Object> queue, String name,
					Semaphore produserSemaphore, Semaphore consumerSemaphore) {
	  this.queue = queue;
	  this.name = name;
	  this.producerSemaphore = produserSemaphore;
	  this.consumerSemaphore = consumerSemaphore;
   }

   @Override
   public void run () {
	  while (true) {
		 try {
			producerSemaphore.acquire ();
		 } catch (InterruptedException e) {
			throw new RuntimeException (e);
		 }
		 queue.add (new Object ());
		 System.out.println (name + " added an object to the queue"
									 + " " + queue.size ());
		 consumerSemaphore.release ();

	  }
   }

}
