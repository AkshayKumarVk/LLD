package org.example.low_level_design.lld1.generic.generic_method;

public class client {
   public static void main (String[] args) {
//	  callPopulation ();
//	  genericData1 ();
//	  genericData2 ();
//	  genericFunction ();

   }

   private static void genericFunction () {
	  GenericPair.fun (120);
	  GenericPair.fun ("ajf");
	  GenericPair.fun (true);
	  GenericPair.fun (3423.432);
	  GenericPair.fun (new GenericPair<> (134, "ajf"));
   }


   private static void gernericData2 () {
	  Pair p = new Pair ();
	  Object o = p.test2 ("ajfh", 3423324);
	  System.out.println (o.getClass ().getName ());
   }

   private static void genericData1 () {
	  Pair p1 = new Pair ();
	  p1.test1 (44);
   }


   private static void callPopulation () {
	  Pair p1 = new Pair ();
	  p1.first = "India";
	  p1.second = 1350000000L;
	  String name = (String) p1.first;
	  Long value = (Long) p1.second;
	  System.out.println (name);

   }
}
