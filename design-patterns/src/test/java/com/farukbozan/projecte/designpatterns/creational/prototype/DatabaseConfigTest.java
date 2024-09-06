package com.farukbozan.projecte.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class DatabaseConfigTest {

    @Test
    void should_get_prototypes() {
        //GIVEN
        var defaultConfig = new DatabaseConfig("url",
                                               "username",
                                               "password",
                                               "driver",
                                               1000,
                                               10,
                                               20);

        //WHEN
        var xDatabaseConfig = new XDatabaseConfig(defaultConfig);
        var yDatabaseConfig = new YDatabaseConfig(defaultConfig);

        XDatabaseConfig xDatabaseConfigCopy = (XDatabaseConfig) xDatabaseConfig.copy();
        YDatabaseConfig yDatabaseConfigCopy = (YDatabaseConfig) yDatabaseConfig.copy();

        xDatabaseConfigCopy.setxDialect("xDialect");
        yDatabaseConfigCopy.setyVersion(12);

        //THEN
        assertNotEquals(xDatabaseConfig, xDatabaseConfigCopy);
        assertNotEquals(yDatabaseConfig, yDatabaseConfigCopy);

        assertNull(xDatabaseConfig.getxDialect());
        assertNotNull(xDatabaseConfigCopy.getxDialect());

        assertEquals(0, yDatabaseConfig.getyVersion());
        assertEquals(12, yDatabaseConfigCopy.getyVersion());
    }

}
