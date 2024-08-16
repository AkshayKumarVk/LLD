package org.example.low_level_design.lld2.builder.simple_builder;

public class Builder {

   private String userName;
   private String email;
   private int age;
   private  String  batch;
   private  String phoneNumber;
   private String address;
   private String universityName;
   private Double psp;

   public String getUserName () {
	  return userName;
   }

   public String getEmail () {
	  return email;
   }

   public int getAge () {
	  return age;
   }

   public String getBatch () {
	  return batch;
   }

   public String getPhoneNumber () {
	  return phoneNumber;
   }

   public String getAddress () {
	  return address;
   }

   public String getUniversityName () {
	  return universityName;
   }

   public Double getPsp () {
	  return psp;
   }

   public void setUserName (String userName) {
	  this.userName = userName;
   }

   public void setEmail (String email) {
	  this.email = email;
   }

   public void setAge (int age) {
	  this.age = age;
   }

   public void setBatch (String batch) {
	  this.batch = batch;
   }

   public void setPhoneNumber (String phoneNumber) {
	  this.phoneNumber = phoneNumber;
   }

   public void setAddress (String address) {
	  this.address = address;
   }

   public void setUniversityName (String universityName) {
	  this.universityName = universityName;
   }

   public void setPsp (Double psp) {
	  this.psp = psp;
   }
}
