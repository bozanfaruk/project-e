package com.farukbozan.projecte.memorymanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CallByValueTest {

    @Test
    void should_copy_value() {
        //GIVEN
        int callCount = 12;
        String callName = "First call";
        var callByValue = new CallByValue(callCount, callName);

        //WHEN
        tryToChangeValue(callCount, callByValue);

        //THEN
        assertEquals(12, callByValue.getCallCount());
        assertEquals("Second call", callByValue.getCallName());

        assertEquals(12, callCount);
        assertEquals("First call", callName);
    }

    private void tryToChangeValue(int callCount, CallByValue callByValue) {
        callCount = 15;
        callByValue.setCallName("Second call");
    }

}
