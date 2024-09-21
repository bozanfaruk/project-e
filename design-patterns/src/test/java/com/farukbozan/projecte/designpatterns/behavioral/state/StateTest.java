package com.farukbozan.projecte.designpatterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StateTest {

    @Test
    void should_change_state() {
        //GIVEN
        var activeState = new ActiveState();
        var passiveState = new PassiveState();
        var halfOpenState = new HalfOpenState();

        var context = new Context();

        //WHEN
        context.setCircuitBreakerState(passiveState);
        boolean called = context.callAPI();

        //THEN
        assertTrue(called);

        //WHEN
        context.setCircuitBreakerState(activeState);
        called = context.callAPI();

        //THEN
        assertFalse(called);

        //WHEN
        context.setCircuitBreakerState(halfOpenState);
        called = context.callAPI();

        //THEN
        assertFalse(called);

        //WHEN
        context.incCallCount();
        called = context.callAPI();

        //THEN
        assertTrue(called);
    }

}
