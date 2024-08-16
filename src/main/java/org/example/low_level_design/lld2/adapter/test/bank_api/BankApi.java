package org.example.low_level_design.lld2.adapter.test.bank_api;

public interface BankApi {

   void transferAmount (String from, String to, int amount);

   void registerUser (String userName, String password);

   void withdraw (String from, String password, String amount);
}

