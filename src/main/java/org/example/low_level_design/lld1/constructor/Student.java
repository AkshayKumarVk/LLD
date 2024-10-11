package org.example.low_level_design.lld1.constructor;

public class Student {

   int age;
   String name;

//   Student(){
//	  name="Ram";
//	  age=23;
//   }
   	void display(){
	   System.out.println ("My name is " + name+ " my age is "+age);
	}

	void sayHello(String cname){
	   System.out.println (name+ " says hello to " +cname);
	}

}
