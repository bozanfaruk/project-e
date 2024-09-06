package com.farukbozan.projecte.designpatterns.creational.prototype;

public class YDatabaseConfig extends DatabaseConfig implements Prototype {

    private int yVersion;

    public YDatabaseConfig(DatabaseConfig config) {
        super(config.getUrl(),
              config.getUsername(),
              config.getPassword(),
              config.getDriver(),
              config.getConnectionTimeout(),
              config.getConnectionPoolSize(),
              config.getMaxConnections());
    }

    public int getyVersion() {
        return yVersion;
    }

    public void setyVersion(int yVersion) {
        this.yVersion = yVersion;
    }

    @Override
    public Prototype copy() {
        return new YDatabaseConfig(this);
    }
}
