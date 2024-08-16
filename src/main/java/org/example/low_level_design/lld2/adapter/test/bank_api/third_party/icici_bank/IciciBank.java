package org.example.low_level_design.lld2.adapter.test.bank_api.third_party.icici_bank;

public class IciciBank {

   public void sendMoney (String to, String from, int amount) {
	  System.out.println ("Sending money to " + to+ " from " + from + " rupees "+ amount);
   }
}
