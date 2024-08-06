package org.example.low_level_design.lld1.Tests.staticMethodTest;

public class Client {
   public static void main (String[] args) {
	  overrideMethod();
   }

   private static void overrideMethod () {
	  SuperClass.display ();
	  SubClass.display ();
   }
}
