package org.example.low_level_design.lld2.adapter.test.bank_api.adapters;


import org.example.low_level_design.lld2.adapter.test.bank_api.BankApi;
import org.example.low_level_design.lld2.adapter.test.bank_api.third_party.axix_bank.AxisBank;

public class AxisBankAdapter implements BankApi {
   AxisBank axisBank = new AxisBank ();

   @Override
   public void transferAmount (String from, String to, int amount) {
	  axisBank.transferMoney (from,to, amount);
   }

   @Override
   public void registerUser (String userName, String password) {

   }

   @Override
   public void withdraw (String from, String password, String amount) {

   }
}
