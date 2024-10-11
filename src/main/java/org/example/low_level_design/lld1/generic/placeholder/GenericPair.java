package org.example.low_level_design.lld1.generic.placeholder;



public class GenericPair<T1, T2>{
   T1 first;
   T2 second;

   public void setFirst(T1 first) {
	  this.first = first;
   }

   public void setSecond(T2 second) {
      this.second = second;
   }

   T1 getFirst() {
	  return this.first;
   }

   T2 getSecond() {
      return this.second;
   }
}
