package com.farukbozan.projecte.designpatterns.creational.prototype;

public class DatabaseConfig {

    private final String url;

    private final String username;

    private final String password;

    private final String driver;

    private final int connectionTimeout;

    private final int connectionPoolSize;

    private final int maxConnections;

    public DatabaseConfig(String url,
                          String username,
                          String password,
                          String driver,
                          int connectionTimeout,
                          int connectionPoolSize,
                          int maxConnections) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.driver = driver;
        this.connectionTimeout = connectionTimeout;
        this.connectionPoolSize = connectionPoolSize;
        this.maxConnections = maxConnections;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getConnectionPoolSize() {
        return connectionPoolSize;
    }

    public int getMaxConnections() {
        return maxConnections;
    }
}
