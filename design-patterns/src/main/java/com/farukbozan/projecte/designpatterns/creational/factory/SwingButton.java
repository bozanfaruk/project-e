package com.farukbozan.projecte.designpatterns.creational.factory;

import java.util.logging.Logger;

public class SwingButton implements Button {

    @Override
    public void onClick() {
        Logger.getLogger(SwingButton.class.getName()).info("Swing button clicked");
    }

    @Override
    public String getName() {
        return "Swing button";
    }
}
