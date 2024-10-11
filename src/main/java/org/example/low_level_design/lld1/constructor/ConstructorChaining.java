package org.example.low_level_design.lld1.constructor;

public class ConstructorChaining {
   public ConstructorChaining(){
	  this("java constructor");
	  System.out.println ("default constructor called");
   }
   public ConstructorChaining(String  string){
	  System.out.println ("parameterised");
   }
}
