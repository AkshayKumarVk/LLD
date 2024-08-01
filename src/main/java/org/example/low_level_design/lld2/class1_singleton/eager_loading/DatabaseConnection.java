package org.example.low_level_design.lld2.class1_singleton.eager_loading;

public class DatabaseConnection {
   private static DatabaseConnection INSTANCE = new DatabaseConnection ();
   private String url;
   private String username;
   private String password;

//   make constructor private

   private DatabaseConnection () {
   }

   public static DatabaseConnection getInstance () {
	  return INSTANCE;
   }

   public static void setItems (String url, String username, String password) {
	  INSTANCE.url = url;
	  INSTANCE.username = username;
	  INSTANCE.password = password;
   }
}