package org.example.low_level_design.lld2.factory.flutter.factory;

import org.example.low_level_design.lld2.factory.flutter.components.button.AndroidButton;
import org.example.low_level_design.lld2.factory.flutter.components.button.Button;
import org.example.low_level_design.lld2.factory.flutter.components.dropdown.AndroidDropdown;
import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;
import org.example.low_level_design.lld2.factory.flutter.components.menu.Menu;

public class AndroidUiFactory implements UiFactory {

   @Override
   public Button createButton () {
	  return new AndroidButton ();
   }

   @Override
   public Menu createMenu () {
	  return null;
   }

   @Override
   public Dropdown createDropdown () {
	  return  new AndroidDropdown ();
   }
}
