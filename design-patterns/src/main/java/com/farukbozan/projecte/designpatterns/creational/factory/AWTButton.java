package com.farukbozan.projecte.designpatterns.creational.factory;

public class AWTButton implements Button {

    @Override
    public void onClick() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
        return "AWT button";
    }
}
