package org.example.low_level_design.lld2.builder.simple_builder;

public class Student {
   private String userName;
   private String email;
   private int age;
   private  String  batch;
   private  String phoneNumber;
   private String address;
   private String universityName;
   private Double psp;


   public  Student (Builder builder){
	  this.userName=builder.getUserName ();
	  this.email=builder.getEmail ();
	  this.age=builder.getAge ();
	  this.batch=builder.getBatch ();
	  this.phoneNumber=builder.getPhoneNumber ();
	  this.address=builder.getAddress ();
	  this.universityName=builder.getUniversityName ();
	  this.psp=builder.getPsp ();
   }
}
