package org.example.low_level_design.lld1.functional_interface;

import java.util.function.BiConsumer;

public class Client {
   public static void main (String[] args) {
	  sampleFunctionalInterface ();
//	  demoBiConsumer ();
//	  demoRunnable();
   }

   private static void demoRunnable () {

	  Runnable runnable = new Runnable(){
		 @Override
		 public void run(){
			System.out.println ("run");
		 }
	  };
	  runnable.run ();
   }

   private static void demoBiConsumer () {

	  BiConsumer<String, Integer> biConsumer = new BiConsumer<> () {
		 @Override
		 public void accept (String s, Integer i) {
			System.out.println (s + "	" + i);
		 }
	  };

	  biConsumer.accept ("Akshay", 8136);


   }

   private static void sampleFunctionalInterface () {

	  SampleFunctionalInterface functionalInterface =
			  new SampleFunctionalInterface () {
				 @Override
				 public void print () {
					System.out.println ("Printing new sample functional interface");
				 }
//				 @Override
//				 public void print2(){
//					System.out.println ("hai");
//				 }
			  };
	  functionalInterface.print ();
//	  functionalInterface.print2 ();
   }
}
