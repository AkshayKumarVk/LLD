package org.example.low_level_design.lld2.class3_factory.flutter.components.button;

public class IosButton implements  Button{

   @Override
   public void click(){
	  System.out.println ("IOS Button clicked");
   }
}
