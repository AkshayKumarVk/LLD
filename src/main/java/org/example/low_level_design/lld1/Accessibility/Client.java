package org.example.low_level_design.lld1.Accessibility;

public class Client {

   public static void main (String[] args) {
	Client.test ();
   }

   static void test (){
	  Home home =new Home ();

	  home.defaultAccess ();
	  home.pubicAccess ();
	  home.protectedAccess ();
//	  home.privateAttribute();
   }
}
