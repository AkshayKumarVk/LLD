package org.example.low_level_design.tests;

import java.util.ArrayList;

public class Array {
   public static void main (String[] args) {
	  extractWordsByLength ("akshay");
   }


   public static ArrayList<String> extractWordsByLength (String A) {

	  ArrayList<String> result = new ArrayList ();

	  if (A == null || A.isEmpty ()) {
		 return result;
	  }

	  int i = 0;

	  while (i < A.length ()) {

		 int length = 0;

		 while (i < A.length () && Character.isDigit (A.charAt (i))) {
			length = length * 10 + (A.charAt (i) - '0');
			i++;
		 }

		 i++;

		 StringBuilder word = new StringBuilder ();

		 while (i < A.length () && A.charAt (i) != 'S') {
			word.append (A.charAt (i));
		 }

		 if (word.length () == length) {
			result.add (word.toString ());
		 }
		 i++;
	  }

	  return result;

   }
}
