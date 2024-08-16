package org.example.low_level_design.lld2.adapter.test.bank_api.third_party.yes_bank;

public class YesBank {
   public void transferAmount (String from, String to, int amount) {
	  System.out.println ("Sending money to " + to+ " from " + from + " rupees "+ amount);
   }
}
