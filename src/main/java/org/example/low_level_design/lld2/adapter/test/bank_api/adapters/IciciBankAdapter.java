package org.example.low_level_design.lld2.adapter.test.bank_api.adapters;

import org.example.low_level_design.lld2.adapter.test.bank_api.BankApi;
import org.example.low_level_design.lld2.adapter.test.bank_api.third_party.icici_bank.IciciBank;

public class IciciBankAdapter implements BankApi {

   IciciBank iciciBank = new IciciBank ();

   @Override
   public void transferAmount (String from, String to, int amount) {
	  iciciBank.sendMoney (to,from,amount);
   }

   @Override
   public void registerUser (String userName, String password) {

   }

   @Override
   public void withdraw (String from, String password, String amount) {

   }
}
