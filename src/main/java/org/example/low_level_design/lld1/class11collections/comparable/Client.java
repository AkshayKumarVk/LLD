package org.example.low_level_design.lld1.class11collections.comparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class Client {
   public static void main (String[] args) {
	  demoCar ();
   }

   private static void demoCar () {

	  Car car1 = new Car (1111, "Audi", "Black", 20, 2010, "Audi", 250);
	  Car car2 = new Car (2222, "BMW", "White", 10, 2011, "BMW", 400);
	  Car car3 = new Car (3333, "Mercedes", "Red", 5, 2012, "Mercedes", 150);
	  Car car4 = new Car (4444, "Porche", "Red", 5, 2013, "Mercedes", 160);
	  Car car5 = new Car (5555, "Maruti", "Red", 5, 2014, "Mercedes", 130);

	  Queue<Car> pq = new PriorityQueue<> ();

	  pq.add (car1);
	  pq.add (car2);
	  pq.add (car3);
	  pq.add (car4);
	  pq.add (car5);

	  while (!pq.isEmpty ()) {
		 Car cars = pq.poll ();
		 System.out.println (cars);
	  }

	  //	  System.out.println (car1.toString ());


	  System.out.println ("debug");
   }
}
