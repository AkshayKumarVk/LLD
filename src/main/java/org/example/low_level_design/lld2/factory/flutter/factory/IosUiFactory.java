package org.example.low_level_design.lld2.factory.flutter.factory;

import org.example.low_level_design.lld2.factory.flutter.components.button.Button;
import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;
import org.example.low_level_design.lld2.factory.flutter.components.menu.Menu;

public class IosUiFactory implements UiFactory{
   @Override
   public Button createButton () {
	  return null;
   }

   @Override
   public Menu createMenu () {
	  return null;
   }

   @Override
   public Dropdown createDropdown () {
	  return null;
   }
}
