package org.example.low_level_design.lld1.constructor;

public class Main {
   public static void main (String[] args) {
	  student ();
	  constructorChaining ();
	  copyConstructor ();
   }

   private static void copyConstructor () {
	  CopyConstructor copyConstructor1 = new CopyConstructor (24, "Akshay");
	  CopyConstructor copyConstructor2 = new CopyConstructor (copyConstructor1);
//	  copyConstructor1.setAge (89);
//	  copyConstructor2.setName ("ajdskf");
	  System.out.println ("debug");
   }

   private static void constructorChaining () {
	  ConstructorChaining constructorChaining = new ConstructorChaining ();
   }

   private static void student () {

	  Student s1 = new Student ();
	  s1.display ();

	  s1.sayHello ("Akshay");
   }
}