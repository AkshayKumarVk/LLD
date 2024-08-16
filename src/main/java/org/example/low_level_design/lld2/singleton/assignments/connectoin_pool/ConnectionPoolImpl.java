package org.example.low_level_design.lld2.singleton.assignments.connectoin_pool;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool {

   private static ConnectionPoolImpl instance;
   private final int maxConnections;

   private final Queue<DatabaseConnection> databaseConnectionQueue;


   public ConnectionPoolImpl(int maxConnections) {

	  this.maxConnections = maxConnections;
	  this.databaseConnectionQueue=new LinkedList<> ();
	  for(int i=0; i<maxConnections; i++){
		 databaseConnectionQueue.add(new DatabaseConnection());
	  }
//	  initializePool ();
   }

   public static ConnectionPoolImpl getInstance(int maxConnections) {
	  if (instance == null) {

		 synchronized (ConnectionPoolImpl.class){
			if (instance==null){
			   instance=new ConnectionPoolImpl (maxConnections);
			}
		 }
      }
	  return instance;
   }

   public static void reserInstance(){
	  instance=null;
   }


    @Override
    public void initializePool() {
	   for(int i=0; i<maxConnections; i++){
		  databaseConnectionQueue.add(new DatabaseConnection());
	   }
    }

    @Override
    public DatabaseConnection getConnection() {
	  return databaseConnectionQueue.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
		  databaseConnectionQueue.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return databaseConnectionQueue.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}