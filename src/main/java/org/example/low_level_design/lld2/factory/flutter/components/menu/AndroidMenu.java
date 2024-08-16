package org.example.low_level_design.lld2.factory.flutter.components.menu;

import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;

public class AndroidMenu implements Dropdown {
   @Override
   public void click(){
	  System.out.println ("Android Menu clicked");
   }
}
