package com.farukbozan.projecte.designpatterns.creational.prototype;

public class XDatabaseConfig extends DatabaseConfig implements Prototype {

    private String xDialect;

    public XDatabaseConfig(DatabaseConfig config) {
        super(config.getUrl(),
              config.getUsername(),
              config.getPassword(),
              config.getDriver(),
              config.getConnectionTimeout(),
              config.getConnectionPoolSize(),
              config.getMaxConnections());
    }

    public String getxDialect() {
        return xDialect;
    }

    public void setxDialect(String xDialect) {
        this.xDialect = xDialect;
    }

    @Override
    public Prototype copy() {
        return new XDatabaseConfig(this);
    }
}
