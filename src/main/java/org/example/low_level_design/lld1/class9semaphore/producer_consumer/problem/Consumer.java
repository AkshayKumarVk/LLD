package class9semaphore.producer_consumer.problem;

import java.util.Queue;

public class Consumer implements Runnable{
   private Queue<Object> queue;
   private String name;
   private int maxSize;

   public Consumer (Queue<Object> queue, int maxSize, String name) {
	   this.queue = queue;
	   this.name = name;
	   this.maxSize = maxSize;
   }

   @Override
   public void run () {
	   while (true) {

		  if(!this.queue.isEmpty ()) {
			 Object obj = queue.poll ();
			 System.out.println ("Consumer " + name + " removed an object from the queue"+ " "+queue.size ());
		  }
	   }
   }
}
