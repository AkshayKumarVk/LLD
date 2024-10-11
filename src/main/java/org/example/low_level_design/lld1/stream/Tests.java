package org.example.low_level_design.lld1.stream;

import java.util.Arrays;
import java.util.List;

public class Tests {
   public static void main (String[] args) {
	  lengthOfString ();
	  lengthOfStringArray ();
	  lengthOfMultipleElement ();
   }

   private static void lengthOfMultipleElement () {

	  String [] words ={
			  "banana", "blueBerry", "apple", "blackberry", "cherry", "berry"
	  };
   }

   private static void lengthOfStringArray () {
	  String[] words = {
			  "banana", "blueBerry", "apple", "blackberry", "cherry", "berry"
	  };

	  long count = Arrays.stream (words)
						   .filter (name -> name.startsWith ("a"))
						   .mapToInt (String -> String.length ())
						   .sum ();
	  System.out.println (count);
   }

   private static void lengthOfString () {

	  List<String> list = Arrays.asList ("Akshay", "Raju", "Ram", "Xavier", "Satya");

	  System.out.println (
			  list.stream ()
					  .filter (name -> name.startsWith ("R"))
					  .count ()
	  );

   }

   private void list(){
	  List<String> list = Arrays.asList ("Akshay", "Raju", "Ram", "Xavier", "Satya");

	  long count =list.stream().filter (name ->name.startsWith ("a")).count ();
   }
}
