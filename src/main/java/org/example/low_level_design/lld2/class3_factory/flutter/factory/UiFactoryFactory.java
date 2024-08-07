package org.example.low_level_design.lld2.class3_factory.flutter.factory;

import org.example.low_level_design.lld2.class3_factory.flutter.Enum.PlatForm;

public class UiFactoryFactory {
   public static UiFactory getUiFactory (PlatForm platForm) {
	  if (platForm.equals (PlatForm.WINDOWS)) {
		 return new WindowsUiFactory ();
	  }
	  if (platForm.equals (PlatForm.ANDROID)) {
		 return new AndroidUiFactory ();
	  }
	  if (platForm.equals (PlatForm.IOS)) {
		 return new IosUiFactory ();
	  }
	  return null;
   }

}
