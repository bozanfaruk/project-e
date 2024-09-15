package com.farukbozan.projecte.designpatterns.structural.decorator;

public class EncodedLogger implements CustomLogger {

    private final CustomLogger customLogger;

    public EncodedLogger(CustomLogger customLogger) {
        this.customLogger = customLogger;
    }

    @Override
    public String log(String logMessage) {
        return "hasfjdhgasdşalsd ".concat(customLogger.log(logMessage));
    }

}
