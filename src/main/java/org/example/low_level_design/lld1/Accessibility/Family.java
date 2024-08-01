package org.example.low_level_design.lld1.Accessibility;

public class Family {

   Home home = new Home ();

   void accessMethods () {
	  home.pubicAccess ();
	  home.defaultAccess ();
	  home.protectedAccess ();
   }
}
