package org.example.low_level_design.lld1.semaphore.producer_consumer.semaphore_solution;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
   private final Queue<Object> queue;
   private final String name;
   private final Semaphore consumerSemaphore;
   private final Semaphore producerSemaphore;



   public Consumer (Queue<Object> queue, String name,
					Semaphore producerSemaphore, Semaphore consumerSemaphore) {
	  this.queue = queue;
	  this.name = name;
	  this.producerSemaphore = producerSemaphore;
	  this.consumerSemaphore = consumerSemaphore;
   }

   @Override
   public void run () {
	  while (true) {
		 try {
			consumerSemaphore.acquire ();
		 } catch (InterruptedException e) {
			throw new RuntimeException (e);
		 }
		 Object obj = queue.poll ();
		 System.out.println (name + " removed an object from the queue"
									 + " " + queue.size ());
		 producerSemaphore.release ();
	  }

   }
}