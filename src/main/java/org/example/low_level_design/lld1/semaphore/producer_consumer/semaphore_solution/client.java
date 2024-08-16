package org.example.low_level_design.lld1.semaphore.producer_consumer.semaphore_solution;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class client {
   public static void main (String[] args) {
	  Queue<Object> queue = new ConcurrentLinkedQueue<> ();
	  Semaphore producerSemaphore = new Semaphore (5);
	  Semaphore consumerSemaphore = new Semaphore (0);

	  Producer producer1 = new Producer (queue, "Producer1",
			  producerSemaphore, consumerSemaphore);
	  Producer producer2 = new Producer (queue, "Producer2",
			  producerSemaphore, consumerSemaphore);
	  Producer producer3 = new Producer (queue, "Producer3",
			  producerSemaphore, consumerSemaphore);
	  Producer producer4 = new Producer (queue, "Producer4",
			  producerSemaphore, consumerSemaphore);
	  Producer producer5 = new Producer (queue, "Producer5",
			  producerSemaphore, consumerSemaphore);

	  Consumer consumer1 = new Consumer (queue, "Consumer1",
			  producerSemaphore, consumerSemaphore);
	  Consumer consumer2 = new Consumer (queue, "Consumer2",
			  producerSemaphore, consumerSemaphore);
	  Consumer consumer3 = new Consumer (queue, "Consumer3",
			  producerSemaphore, consumerSemaphore);
	  Consumer consumer4 = new Consumer (queue, "Consumer4",
			  producerSemaphore, consumerSemaphore);
	  Consumer consumer5 = new Consumer (queue, "Consumer5",
			  producerSemaphore, consumerSemaphore);

	  Thread p1 = new Thread (producer1);
	  Thread p2 = new Thread (producer2);
	  Thread p3 = new Thread (producer3);
	  Thread p4 = new Thread (producer4);
	  Thread p5 = new Thread (producer5);
	  Thread c1 = new Thread (consumer1);
	  Thread c2 = new Thread (consumer2);
	  Thread c3 = new Thread (consumer3);
	  Thread c4 = new Thread (consumer4);
	  Thread c5 = new Thread (consumer5);

	  p1.start ();
	  p2.start ();
	  p3.start ();
	  p4.start ();
	  p5.start ();
	  c1.start ();
	  c2.start ();
	  c3.start ();
	  c4.start ();
	  c5.start ();
   }

}
