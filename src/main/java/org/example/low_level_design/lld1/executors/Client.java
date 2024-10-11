package org.example.low_level_design.lld1.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client {
   public static void main (String[] args) {
//	  numberPrinter();
	  numberPrinter2();
   }

   private static void numberPrinter2 () {

	  ExecutorService executorService= Executors.newFixedThreadPool(20);

	  for (int i = 1; i <= 100; i++) {
		 int number =i;
		 executorService.submit (() ->{
			System.out.println (number + " 	" + Thread.currentThread ().getName ());
		 });
	  }
   }

   private static void numberPrinter () {
	  ExecutorService executorService = Executors.newFixedThreadPool (20);

	  for (int i = 1; i <= 100; i++) {
		 new Thread (new NumberPrinter (i)).start ();
	  }
   }
}
