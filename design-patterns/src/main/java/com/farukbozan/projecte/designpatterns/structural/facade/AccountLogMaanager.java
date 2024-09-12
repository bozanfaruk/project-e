package com.farukbozan.projecte.designpatterns.structural.facade;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountLogMaanager {

    private static final Logger LOGGER = Logger.getLogger(AccountLogMaanager.class.getName());

    public void logAccountTransaction(Account account, int amount) {
        LOGGER.log(Level.INFO,
                   "Account created a transaction. Updated balance {0}, Transaction amount {1}",
                   new Object[]{account.getBalance(), amount});
    }

}
