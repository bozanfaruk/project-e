package com.farukbozan.projecte.designpatterns.behavioral.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseListenerLogImpl implements DatabaseListener {

    private static final Logger LOGGER = Logger.getLogger(DatabaseListenerLogImpl.class.getName());

    @Override
    public void onConnect(ConnectEvent connectEvent) {
        LOGGER.log(Level.INFO, "Connected to Database at {0} with id {1}", new Object[]{connectEvent.connectTime(), connectEvent.connectionId()});
    }

    @Override
    public void onDisconnect(DisconnectEvent disconnectEvent) {
        LOGGER.log(Level.SEVERE,
                   "Disconnected from database at {0} with reason {1}",
                   new Object[]{disconnectEvent.disconnectTime(), disconnectEvent.reason()});
    }

}
