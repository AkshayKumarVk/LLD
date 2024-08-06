package org.example.low_level_design.lld2.class3_factory.flutter.components.button;

public class AndroidButton implements  Button{

   @Override
   public void click(){
	  System.out.println ("Android Button Clicked");
   }
}
