package org.example.low_level_design.lld2.builder.simple_builder;

public class Client {
   public static void main (String[] args) {
	  Builder builder=new Builder ();
	  builder.setUserName ("akshay");
	  builder.setAge (20);
	  builder.setEmail ("email");

	  Student student1=new Student (builder);


	  System.out.println ("debug");
   }
}
