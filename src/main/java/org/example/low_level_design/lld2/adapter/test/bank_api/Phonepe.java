package org.example.low_level_design.lld2.adapter.test.bank_api;

public class Phonepe {

   private  BankApi bankApi;

   public Phonepe(BankApi bankApi){
	  this.bankApi = bankApi;
   }

   public void transferAmount (String from, String to, int amount) {
	  bankApi.transferAmount (from, to, amount);
   }
}
