package org.example.low_level_design.lld2.class1_singleton.lazy_loading;

public class DatabaseConnection {
   private  static DatabaseConnection INSTANCE=null;
   private  String url;
   private  String username;
   private  String password;

//   make constructor private

   private DatabaseConnection(){
   }

   public static DatabaseConnection getInstance(){
	  if(INSTANCE==null){
		 synchronized (DatabaseConnection.class) {
			if (INSTANCE == null) { //double-checked locking
			   INSTANCE = new DatabaseConnection ();
			}
		 }
	  }
	  return INSTANCE;
   }
   public static void setItems(String url, String username, String password){
	  INSTANCE.url = url;
	  INSTANCE.username = username;
	  INSTANCE.password = password;
   }
}