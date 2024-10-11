package org.example.low_level_design.tests.concorrency;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
   public static void main (String[] args) {
//	  numberPrinter1 ();
//	  numberPrinter2 ();
	  executorService();
   }

   private static void executorService () {

	  Thread thread;
	  ExecutorService executorService = Executors.newFixedThreadPool (20);

	  for(int i=0; i<100;i++){
		 executorService.submit(new NumberPrinter (i));
	  }
   }

   private static void numberPrinter2 () {

	  for (int i = 0; i < 100; i++) {
		 int j = i;
		 Thread thread = new Thread (() -> System.out.println (j + Thread.currentThread ().getName ()));
	  }

   }

   private static void numberPrinter1 () {
	  for (int i = 0; i < 100; i++) {
		 new Thread (new NumberPrinter (i)).start ();

	  }
   }
}
