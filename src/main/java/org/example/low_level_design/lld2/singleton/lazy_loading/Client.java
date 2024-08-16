package org.example.low_level_design.lld2.singleton.lazy_loading;

public class Client {
   public static void main (String[] args) {
	  demoSingleton();
   }

   private static void demoSingleton () {
//	  DatabaseConnection databaseConnection=new DatabaseConnection();

	  String url="database.lazy.url";
	  String userName="admin";
	  String password="password";

	  DatabaseConnection databaseConnection1= DatabaseConnection.getInstance();
	  DatabaseConnection databaseConnection2= DatabaseConnection.getInstance();
	  DatabaseConnection.setItems (url, userName, password);
	  DatabaseConnection.setItems (
			  "http://localhost",
			  "user",
			  "userPassword"
	  );

	  System.out.println ("debug");
   }
}
