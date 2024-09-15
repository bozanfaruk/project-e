package com.farukbozan.projecte.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomLoggerTest {

    @Test
    void should_decorate() {
        //GIVEN
        String message = "This is a log";
        CustomLogger customLogger = new ClassicLogger();
        CustomLogger byteLogger = new ByteLogger(customLogger);
        CustomLogger encodedLogger = new EncodedLogger(customLogger);

        //WHEN
        String customLog = customLogger.log(message);
        String byteLog = byteLogger.log(message);
        String encodedLog = encodedLogger.log(message);

        //THEN
        assertEquals(message, customLog);
        assertEquals("[B@11c20519", byteLog);
        assertEquals("hasfjdhgasdşalsd This is a log", encodedLog);
    }

}
