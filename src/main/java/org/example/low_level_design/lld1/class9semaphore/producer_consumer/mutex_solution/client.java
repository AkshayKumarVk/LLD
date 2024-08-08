package class9semaphore.producer_consumer.mutex_solution;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class client {
   public static void main (String[] args) {
	  Queue<Object> queue = new ConcurrentLinkedQueue<> ();
	  int maxSize = 10;

	  Producer producer1 = new Producer (queue, maxSize, "Producer1");
	  Producer producer2 = new Producer (queue, maxSize, "Producer2");
	  Producer producer3 = new Producer (queue, maxSize, "Producer3");
	  Producer producer4 = new Producer (queue, maxSize, "Producer4");
	  Producer producer5 = new Producer (queue, maxSize, "Producer5");
	  Producer producer6 = new Producer (queue, maxSize, "Producer6");
	  Producer producer7 = new Producer (queue, maxSize, "Producer7");
	  Producer producer8 = new Producer (queue, maxSize, "Producer8");
	  Producer producer9 = new Producer (queue, maxSize, "Producer9");
	  Producer producer10 = new Producer (queue, maxSize, "Producer10");

	  Consumer consumer1 = new Consumer (queue, maxSize, "Consumer1");
	  Consumer consumer2 = new Consumer (queue, maxSize, "Consumer2");
	  Consumer consumer3 = new Consumer (queue, maxSize, "Consumer3");
	  Consumer consumer4 = new Consumer (queue, maxSize, "Consumer4");
	  Consumer consumer5 = new Consumer (queue, maxSize, "Consumer5");
	  Consumer consumer6 = new Consumer (queue, maxSize, "Consumer6");
	  Consumer consumer7 = new Consumer (queue, maxSize, "Consumer7");
	  Consumer consumer8 = new Consumer (queue, maxSize, "Consumer8");
	  Consumer consumer9 = new Consumer (queue, maxSize, "Consumer9");
	  Consumer consumer10 = new Consumer (queue, maxSize, "Consumer10");

	  Thread p1 = new Thread (producer1);
	  Thread p2 = new Thread (producer2);
	  Thread p3 = new Thread (producer3);
	  Thread p4 = new Thread (producer4);
	  Thread p5 = new Thread (producer5);
	  Thread p6 = new Thread (producer6);
	  Thread p7 = new Thread (producer7);
	  Thread p8 = new Thread (producer8);
	  Thread p9 = new Thread (producer9);
	  Thread p10 = new Thread (producer10);

	  Thread c1 = new Thread (consumer1);
	  Thread c2 = new Thread (consumer2);
	  Thread c3 = new Thread (consumer3);
	  Thread c4 = new Thread (consumer4);
	  Thread c5 = new Thread (consumer5);
	  Thread c6 = new Thread (consumer6);
	  Thread c7 = new Thread (consumer7);
	  Thread c8 = new Thread (consumer8);
	  Thread c9 = new Thread (consumer9);
	  Thread c10 = new Thread (consumer10);

	  p1.start ();
	  p2.start ();
	  p3.start ();
	  p4.start ();
	  p5.start ();
	  p6.start ();
	  p7.start ();
	  p8.start ();
	  p9.start ();
	  p10.start ();

	  c1.start ();
	  c2.start ();
	  c3.start ();
	  c4.start ();
	  c5.start ();
	  c6.start ();
	  c7.start ();
	  c8.start ();
	  c9.start ();
	  c10.start ();
   }

}
