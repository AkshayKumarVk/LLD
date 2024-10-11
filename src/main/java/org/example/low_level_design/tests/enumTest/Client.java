package org.example.low_level_design.tests.enumTest;

public class Client {
   public static void main (String[] args) {
	  Rank rank = Rank.TWO;
	  System.out.println (rank+ " " + rank.getValue ());
   }
}
