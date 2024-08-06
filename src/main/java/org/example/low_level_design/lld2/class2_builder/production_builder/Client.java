package org.example.low_level_design.lld2.class2_builder.production_builder;

public class Client {
   public static void main (String[] args) {
//
	  demoStudent();
   }

   private static void demoStudent () {

//	  Builder builder=new Builder ();
	  Student.Builder builder= Student.getBuilder ();
	  builder.setUserName ("akshay").setAge (30).setEmail ("a.email.com").setPsp (73.4).build ();
//	  builder.setAge (20);
//	  builder.setEmail ("email");

//	  Student student1=new Student (builder);
//	  Student student1=builder.build ();


	  System.out.println ("debug");
   }
}
