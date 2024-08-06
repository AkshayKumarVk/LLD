package org.example.low_level_design.lld2.class2_builder.production_builder;

public class Student {
   private final String userName;
   private final String email;
   private final int age;
   private final String batch;
   private final String phoneNumber;
   private final String address;
   private final String universityName;
   private final Double psp;


   private Student (Builder builder) {
	  this.userName = builder.userName;
	  this.email = builder.email;
	  this.age = builder.age;
	  this.batch = builder.batch;
	  this.phoneNumber = builder.phoneNumber;
	  this.address = builder.address;
	  this.universityName = builder.universityName;
	  this.psp = builder.psp;
   }

   public static Builder getBuilder () {
	  return new Builder ();
   }

   public static class Builder {

	  private String userName;
	  private String email;
	  private int age;
	  private String batch;
	  private String phoneNumber;
	  private String address;
	  private String universityName;
	  private Double psp;

	  public Builder setUserName (String userName) {
		 this.userName = userName;
		 return this;
	  }

	  public Builder setEmail (String email) {
		 this.email = email;
		 return this;
	  }

	  public Builder setAge (int age) {
		 this.age = age;
		 return this;
	  }

	  public Builder setBatch (String batch) {
		 this.batch = batch;
		 return this;
	  }

	  public Builder setPhoneNumber (String phoneNumber) {
		 this.phoneNumber = phoneNumber;
		 return this;
	  }

	  public Builder setAddress (String address) {
		 this.address = address;
		 return this;
	  }

	  public Builder setUniversityName (String universityName) {
		 this.universityName = universityName;
		 return this;
	  }

	  public Builder setPsp (Double psp) {
		 this.psp = psp;
		 return this;
	  }

	  public Student build () {
		 return new Student (this);

	  }
   }


}
