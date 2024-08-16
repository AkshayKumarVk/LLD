package org.example.low_level_design.lld2.singleton.eager_loading;

public class Client {
   public static void main (String[] args) {
	  demoSingleton();
   }

   private static void demoSingleton () {
//	  DatabaseConnection databaseConnection=new DatabaseConnection();

	  String url="database.com";
	  String username="admin";
	  String password="password";

	  DatabaseConnection databaseConnection1=DatabaseConnection.getInstance();
	  DatabaseConnection databaseConnection2=DatabaseConnection.getInstance();
	  DatabaseConnection.setItems (url, username,password);

	  System.out.println ("debug");
   }
}
