package class9semaphore.producer_consumer.mutex_solution;

import java.util.Queue;

public class Consumer implements Runnable {
   private final Queue<Object> queue;
   private final String name;
   private final int maxSize;

   public Consumer (Queue<Object> queue, int maxSize, String name) {
	  this.queue = queue;
	  this.name = name;
	  this.maxSize = maxSize;
   }

   @Override
   public void run () {
	  while (true) {
		 synchronized (queue) {
			if (!this.queue.isEmpty ()) {
			   Object obj = queue.poll ();
			   System.out.println ("Consumer " + name + " removed an object from the queue" + " " + queue.size ());
			}
		 }

	  }
   }
}
