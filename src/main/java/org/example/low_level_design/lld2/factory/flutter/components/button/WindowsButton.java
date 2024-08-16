package org.example.low_level_design.lld2.factory.flutter.components.button;

public class WindowsButton implements  Button{

   @Override
   public  void click(){
	  System.out.println ("Windows Button clicked");
   }
}
