package org.example.low_level_design.lld2.singleton.assignments.connectoin_pool;

public class Client {
   public static void main (String[] args) {
	  ConnectionPool connectionPool = ConnectionPoolImpl.getInstance(7);
	  ConnectionPool connectionPool1 = ConnectionPoolImpl.getInstance(7);
	  ConnectionPool connectionPool2 = new ConnectionPoolImpl (7);
	  ConnectionPool connectionPool3 = new ConnectionPoolImpl (7);


	  System.out.println (connectionPool1.hashCode());
	  System.out.println (connectionPool.hashCode());
	  System.out.println (connectionPool2.hashCode());
	  System.out.println (connectionPool3.hashCode());
   }
}
