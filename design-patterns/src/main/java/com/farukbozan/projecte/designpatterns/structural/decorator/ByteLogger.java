package com.farukbozan.projecte.designpatterns.structural.decorator;

public class ByteLogger implements CustomLogger {

    private final CustomLogger customLogger;

    public ByteLogger(CustomLogger customLogger) {
        this.customLogger = customLogger;
    }

    @Override
    public String log(String logMessage) {
        String log = customLogger.log(logMessage);
        return log.getBytes().toString();
    }

}
