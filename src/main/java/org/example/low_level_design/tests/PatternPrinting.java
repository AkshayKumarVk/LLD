package org.example.low_level_design.tests;

import java.util.Scanner;

public class PatternPrinting {

   public void pattern3 () {
	  Scanner scanner = new Scanner (System.in);
	  System.out.print ("Enter the number of rows:	");

	  int row = scanner.nextInt ();

	  for (int i = row; i >= 1; i--) {
		 for (int j = 1; j<i; j++) {
			System.out.print ("  ");
		 }
		 for (int k = 0; k <= row - i; k++) {
			System.out.print ("* ");
		 }
		 System.out.println ();
	  }
   }

   public void pattern2 () {
	  Scanner scanner = new Scanner (System.in);
	  System.out.print ("Enter the number of rows:	");

	  int row = scanner.nextInt ();

	  for (int i = 1; i < row; i++) {
		 for (int j = 1; j <= i; j++) {
			System.out.print ("* ");
		 }
		 System.out.println ();
	  }
   }

   public void pattern1 () {
	  Scanner scanner = new Scanner (System.in);
	  System.out.print ("Enter the number of rows:	");

	  int row = scanner.nextInt ();

	  for (int i = 0; i < row; i++) {
		 for (int j = 0; j < row; j++) {
			System.out.print ("* ");
		 }
		 System.out.println ();
	  }
   }
}
