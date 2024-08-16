package org.example.low_level_design.lld2.prototype.tests.clone;

public class Client {
   public static void main (String[] args) {
	  try {

		 demoClone ();
	  } catch (CloneNotSupportedException e) {
		 System.out.println (e.getMessage ());
	  }
   }

   private static void demoClone () throws CloneNotSupportedException{
	  Student student1 = new Student (23, "Ravi");

	  Student studentClone=(Student) student1.clone ();

	  System.out.println ("debug");
   }
}
