package com.farukbozan.projecte.designpatterns.behavioral.observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseListenerSMSImpl implements DatabaseListener {

    private static final Logger LOGGER = Logger.getLogger(DatabaseListenerSMSImpl.class.getName());

    private final SmsAccount smsAccount;

    public DatabaseListenerSMSImpl(SmsAccount smsAccount) {
        this.smsAccount = smsAccount;
    }

    @Override
    public void onConnect(ConnectEvent connectEvent) {
        LOGGER.log(Level.INFO, "Connect SMS sent to {0}", new Object[]{smsAccount.phoneNumber()});
    }

    @Override
    public void onDisconnect(DisconnectEvent disconnectEvent) {
        LOGGER.log(Level.INFO, "Disconnect SMS sent to {0}", new Object[]{smsAccount.phoneNumber()});

    }

}
