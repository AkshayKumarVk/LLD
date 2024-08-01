package org.example.low_level_design.lld1.Accessibility;

public class SecondHome extends Home {

   Home home = new Home ();

   void accessMethods() {
	  home.protectedAccess ();
	  home.pubicAccess ();
	  home.defaultAccess ();
   }
}
