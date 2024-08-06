package org.example.low_level_design.lld2.class2_builder.assignment.message_service;

public class Client {
   public static void main (String[] args) {

	  demoBuilder();
   }

   private static void demoBuilder () {

	  MessageBuilder.Builder builder= MessageBuilder.getBuilder ();

	  builder.setMessageType (MessageType.TEXT).setContent ("hai").setRecipient ("me").build ();

	  System.out.println ("debug");

   }
}
