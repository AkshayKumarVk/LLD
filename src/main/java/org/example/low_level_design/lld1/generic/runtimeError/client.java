package org.example.low_level_design.lld1.generic.runtimeError;

public class client {
   public static void main (String[] args) {
	  callPopulation ();
   }

   private static void callPopulation () {
	  Pair p1 = new Pair ();
	  p1.first = "India";
	  p1.second = 1350000000L;
	  String name = (String) p1.first;
	  Long value= (Long) p1.second;
	  System.out.println (name);

   }
}
