package org.example.low_level_design.lld2.factory.flutter.factory;

import org.example.low_level_design.lld2.factory.flutter.components.button.Button;
import org.example.low_level_design.lld2.factory.flutter.components.dropdown.Dropdown;
import org.example.low_level_design.lld2.factory.flutter.components.menu.Menu;

public interface UiFactory {

   public Button createButton();

   public Menu createMenu();

   public Dropdown createDropdown();
}
