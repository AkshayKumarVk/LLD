package org.example.low_level_design.lld2.adapter.test.bank_api.third_party.axix_bank;

public class AxisBank {
   public void transferMoney (String from, String to, int amount) {
	  System.out.println ("Sending money to " + to+ " from " + from + " rupees "+ amount);
   }
}
