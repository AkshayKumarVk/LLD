package org.example.low_level_design.lld2.factory.flutter.components.menu;

import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;

public class WindowsMenu implements Dropdown {
   @Override
   public void click(){
	  System.out.println ("Windows Menu clicked");
   }
}
