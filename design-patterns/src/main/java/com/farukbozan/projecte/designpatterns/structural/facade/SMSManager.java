package com.farukbozan.projecte.designpatterns.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SMSManager {

    private static final Logger LOGGER = Logger.getLogger(SMSManager.class.getName());

    public void sendSMS(Account account) {
        LOGGER.log(Level.INFO, "Balance update {0}", account.getBalance());
    }

}
