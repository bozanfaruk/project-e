package com.farukbozan.projecte.designpatterns.structural.proxy.protection;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GatewayProxy extends Gateway {

    private static final Logger LOGGER = Logger.getLogger(GatewayProxy.class.getName());

    private static final List<String> BANNED_IPS = List.of("127.0.0.2",
                                                           "127.0.0.3",
                                                           "127.0.0.4");

    @Override
    public boolean executeRequest(Request request) {
        if (BANNED_IPS.contains(request.getIp())) {
            LOGGER.log(Level.WARNING, "Banned IP request {0}. Returning...", new Object[]{request});
            return Boolean.FALSE;
        }
        return super.executeRequest(request);
    }
}
