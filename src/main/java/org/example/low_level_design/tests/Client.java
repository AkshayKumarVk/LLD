package org.example.low_level_design.tests;

import java.util.Scanner;

public class Client {
   public static void main (String[] args) {
	  System.out.print ("Enter the Pattern Number:	");
	  Scanner scanner = new Scanner (System.in);
	  while (true) {
		 int n = scanner.nextInt ();

		 PatternPrinting patternPrinting = new PatternPrinting ();
		 switch (n) {
			case 1 -> patternPrinting.pattern1 ();
			case 2 -> patternPrinting.pattern2 ();
			case 3 -> patternPrinting.pattern3 ();

			default -> System.out.println ("Wrong input");
		 }


	  }
   }

//   private static void patternPrinting2 () {
//	  PatternPrinting patternPrinting = new PatternPrinting ();
//
//	  patternPrinting.pattern2 ();
//
//   }
//
//   private static void patternPrinting1 () {
//	  PatternPrinting patternPrinting = new PatternPrinting ();
//
//   }
}
