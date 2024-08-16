package org.example.low_level_design.lld2.factory.flutter;

import org.example.low_level_design.lld2.factory.flutter.Enum.PlatForm;
import org.example.low_level_design.lld2.factory.flutter.Enum.Theme;
import org.example.low_level_design.lld2.factory.flutter.factory.UiFactory;
import org.example.low_level_design.lld2.factory.flutter.factory.UiFactoryFactory;

public class Flutter {
   public void refreshUi () {
	  System.out.println ("Refreshing UI");
   }

   public void setTheme (Theme theme) {
	  System.out.println ("Setting " + theme.name () + " Theme");
   }

   UiFactory getUiFactory (PlatForm platForm) {
//	  if(platForm.equals (PlatForm.IOS)){
//		 return new IosUiFactory ();
//	  }
//	  if (platForm.equals (PlatForm.ANDROID)){
//		 return new AndroidUiFactory ();
//	  }
//	  if(platForm.equals (PlatForm.WINDOWS)){
//		 return  new WindowsUiFactory ();
//	  }
	  return UiFactoryFactory.getUiFactory (platForm);
   }
}
