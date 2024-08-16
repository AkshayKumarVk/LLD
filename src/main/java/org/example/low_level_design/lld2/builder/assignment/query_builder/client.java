package org.example.low_level_design.lld2.builder.assignment.query_builder;

public class client {
   public static void main (String[] args) {
	  QueryBuilder.Builder builder= QueryBuilder.getBuilder ();

	  builder.setSelect ("name").setFrom ("Student").setJoin ("School").setWhere ("Class=9");
	  System.out.println ("debug");
   }
}
