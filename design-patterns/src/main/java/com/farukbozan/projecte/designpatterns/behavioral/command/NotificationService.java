package com.farukbozan.projecte.designpatterns.behavioral.command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NotificationService {

    private static final Logger LOGGER = Logger.getLogger(NotificationService.class.getName());

    public void notifyCargoUnload(Cargo cargo) {
        LOGGER.log(Level.INFO, "Unload cargo transaction. Code: {0}", new Object[]{cargo.code()});
    }

}
