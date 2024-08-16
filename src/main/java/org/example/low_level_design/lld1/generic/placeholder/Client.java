package class10_generic.placeholder;

import class10_generic.runtimeError.Pair;

public class Client {
   public static void main (String[] args) {
	  demoGenericPair ();
	  getCoordinates();
   }

   private static void getCoordinates () {
	  GenericPair<Double,Double> p2= new GenericPair<> ();
	  p2.setFirst (20.30);
	  p2.setSecond (30.60);
	  System.out.println (p2.getFirst ());
	  System.out.println (p2.getSecond());
   }

   private static void demoGenericPair () {
//	  GenericPair<String, Integer> p1 = new GenericPair<>("Akshay", 29);
	  GenericPair<String, Integer> p1 = new GenericPair<> ();
	  p1.setFirst ("India");
	  p1.setSecond (140);
	  String name = p1.getFirst ();

	  Integer age = p1.getSecond ();
	  System.out.println ("Country: "+name+" Population: "+age);
   }

}
