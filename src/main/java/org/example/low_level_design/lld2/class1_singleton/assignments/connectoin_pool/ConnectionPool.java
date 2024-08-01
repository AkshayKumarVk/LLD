package org.example.low_level_design.lld2.class1_singleton.assignments.connectoin_pool;

public interface ConnectionPool {

    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();

}