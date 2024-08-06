package org.example.low_level_design.lld1.Tests;

import java.util. *;


public class Test {
   public static void main (String[] args) {
//	  demoLinkedList();
	  stringTest();
   }


   private static void stringTest () {
	  String string1= new String ("Original");
	  string1+="Append";
	  System.out.println ("Debug");
   }

   private static void demoLinkedList () {

	  List <Integer> list = new LinkedList<> ();
	  list.add (39);
	  list.add (40);
	  list.add (41);

	  System.out.println (list.hashCode ());

	  System.out.println ("Debug");
   }

}
