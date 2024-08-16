package org.example.low_level_design.lld2.adapter.test.bank_api;

import org.example.low_level_design.lld2.adapter.test.bank_api.adapters.IciciBankAdapter;

public class Client {
   public static void main (String[] args) {
	  demoPhonepe();
   }

   private static void demoPhonepe () {
	  BankApi bankApi=new IciciBankAdapter ();

	  Phonepe phonepe=new Phonepe (bankApi);

	  phonepe.transferAmount ("Raju", "Ravi", 3499);

	  System.out.println ("Debug");
   }
}
