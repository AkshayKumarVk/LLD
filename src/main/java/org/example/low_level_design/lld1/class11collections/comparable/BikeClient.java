package org.example.low_level_design.lld1.class11collections.comparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class BikeClient {
   public static void main (String[] args) {
	  demoBike ();
   }

   private static void demoBike () {
	  Bike bike1 = new Bike ("Platina", 1000, 2000, 160);
	  Bike bike2 = new Bike ("Pulsar", 1500, 2005, 180);
	  Bike bike3 = new Bike ("Splendor", 1200, 2002, 150);
	  Bike bike4 = new Bike ("Activa", 1300, 2003, 140);
	  Bike bike5 = new Bike ("Duke", 2000, 2007, 200);
	  Bike bike6 = new Bike ("Bullet", 1800, 2006, 190);

	  Queue<Bike> bikeQueue = new PriorityQueue<> ();

	  bikeQueue.add (bike1);
	  bikeQueue.add (bike2);
	  bikeQueue.add (bike3);
	  bikeQueue.add (bike4);
	  bikeQueue.add (bike5);
	  bikeQueue.add (bike6);

	  while (!bikeQueue.isEmpty ()) {

		 System.out.println (bikeQueue.poll ());
	  }

   }
}
