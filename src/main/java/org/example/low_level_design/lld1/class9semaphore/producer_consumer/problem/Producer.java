package class9semaphore.producer_consumer.problem;

import java.util.Queue;

public class Producer implements Runnable {
   private Queue<Object> queue;
   private String name;
   private int maxSize;


   public Producer (Queue<Object> queue, int maxSize, String name) {
	  this.queue = queue;
	  this.name = name;
	  this.maxSize = maxSize;
   }

   @Override
   public void run () {
	  while (true) {
		 if(this.queue.size () < maxSize) {
			queue.add(new Object());
			System.out.println ("Producer " + name + " added an object to the queue"+" "+queue.size());
		 }
	  }
   }

}
