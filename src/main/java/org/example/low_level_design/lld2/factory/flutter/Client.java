package org.example.low_level_design.lld2.factory.flutter;

import org.example.low_level_design.lld2.factory.flutter.Enum.PlatForm;
import org.example.low_level_design.lld2.factory.flutter.Enum.Theme;
import org.example.low_level_design.lld2.factory.flutter.components.button.Button;
import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;
import org.example.low_level_design.lld2.factory.flutter.factory.UiFactory;

public class Client {
   public static void main (String[] args) {
	  getFlutter ();
   }

   private static void getFlutter () {
	  PlatForm platForm=PlatForm.ANDROID;
	  Theme theme= Theme.DARK;
	  Flutter flutter = new Flutter ();

	  flutter.refreshUi ();
	  flutter.setTheme (theme);

	  UiFactory uiFactory= flutter.getUiFactory (platForm);

	  Button button=uiFactory.createButton ();
	  button.click ();

	  Dropdown dropdown=uiFactory.createDropdown ();
	  dropdown.click ();

	  System.out.println ("debug");
   }
}
