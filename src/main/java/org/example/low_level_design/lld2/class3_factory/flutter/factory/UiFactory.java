package org.example.low_level_design.lld2.class3_factory.flutter.factory;

import org.example.low_level_design.lld2.class3_factory.flutter.components.button.Button;
import org.example.low_level_design.lld2.class3_factory.flutter.components.dropdown.Dropdown;
import org.example.low_level_design.lld2.class3_factory.flutter.components.menu.Menu;

public interface UiFactory {

   public Button createButton();

   public Menu createMenu();

   public Dropdown createDropdown();
}
