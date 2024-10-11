package org.example.low_level_design.lld1.generic.generic_method;

public class Pair {
   Object first;
   Object second;

   public <T> void test1(T data) {
	  System.out.println (data.getClass().getName()+" "+data);
   }

   public <T,U> T test2(T name,U data) {
	  System.out.println (name);
	  return (T) data;
   }
}
