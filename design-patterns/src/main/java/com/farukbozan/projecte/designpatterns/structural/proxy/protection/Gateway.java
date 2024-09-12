package com.farukbozan.projecte.designpatterns.structural.proxy.protection;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Gateway {

    private static final Logger LOGGER = Logger.getLogger(Gateway.class.getName());

    public boolean executeRequest(Request request) {
        LOGGER.log(Level.INFO, "Valid request {0}", request);
        return Boolean.TRUE;
    }
}
