package com.farukbozan.projecte.designpatterns.structural.decorator;

public class ClassicLogger implements CustomLogger {

    @Override
    public String log(String logMessage) {
        return logMessage;
    }
}
