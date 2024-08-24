package org.example.low_level_design.lld1.lambdas;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Client {
   public static void main (String[] args) throws Exception {
	  Scanner scanner = new Scanner (System.in);
	  System.out.println ("1 - demoConsumerLambda()");
	  System.out.println ("2 - demoBiConsumer()");
	  System.out.println ("3 - deCallable()");
	  System.out.println ("4 - demoPredicate()");
	  System.out.println ("5 - demoBiPredicate()");
	  System.out.println ("6 - demoRunnable()");
	  int n;
	  while (true) {
		 System.out.print ("Enter the method number:	");
		 n = scanner.nextInt ();

		 switch (n) {
			case 1 -> demoConsumerLambda ();
			case 2 -> demoBiConsumer ();
			case 3 -> deCallable ();
			case 4 -> demoPredicate ();
			case 5 -> demoBiPredicate ();
			case 6 -> domoRunnable ();
			default -> System.out.println ("Invalid input");
		 }
		 System.out.println ();
	  }
//	  while (n >= 6);
   }

   private static void domoRunnable () {

	  Runnable runnable = () -> {
		 System.out.println ("run thread" + Thread.currentThread ().getName ());
	  };

	  Thread thread = new Thread (runnable);
	  thread.start ();

	  Thread threadLambda = new Thread (() -> System.out.println ("Lambda " + Thread.currentThread ().getName ()));
	  threadLambda.start ();

	  Thread threadLambdaSecond = new Thread (() -> System.out.println ("Lambda Second " + Thread.currentThread ().getName ()));
	  threadLambdaSecond.start ();
   }

   private static void demoBiPredicate () {

	  BiPredicate<String, String> biPredicate = String::equals;

	  System.out.println (biPredicate.test ("Scaler", "scaler"));
	  System.out.println (biPredicate.test ("Scaler", "Scaler"));
   }

   private static void demoPredicate () {

	  Predicate<String> predicate = (str) ->{
		 if (str.length() > 5) {
			return true;
		 }
		 return false;
	  };

	  Predicate<String> p1 = (str) -> {
		 return str.length () > 5;
	  };

	  System.out.println (p1.test ("a"));
	  System.out.println (p1.test ("Scaler"));

	  Predicate<String> p2= (str) -> str.length ()>5;
	  System.out.println (p2.test ("dsa"));
	  System.out.println (p2.test("afresh"));


   }

   private static void deCallable () throws Exception {

	  Callable<Integer> callable = () -> {
		 int n = 0;
		 for (int i = 1; i < 100; i++) {
			n += i;
		 }
		 return n;
	  };

	  System.out.println (callable.call ());

   }

   private static void demoBiConsumer () {
	  BiConsumer<String, Integer> biConsumer = (str, age) -> {
		 System.out.println (str + " " + age);
	  };
	  biConsumer.accept ("Akshay", 38);
   }

   private static void demoConsumerLambda () {
	  Consumer<String> consumer = (str) -> {
		 System.out.println ("lambda call " + str);
	  };
	  consumer.accept ("akshay");
   }
}
