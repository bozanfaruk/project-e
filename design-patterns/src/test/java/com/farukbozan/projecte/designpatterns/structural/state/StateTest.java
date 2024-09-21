package com.farukbozan.projecte.designpatterns.structural.state;

import com.farukbozan.projecte.designpatterns.behavioral.state.ActiveState;
import com.farukbozan.projecte.designpatterns.behavioral.state.Context;
import com.farukbozan.projecte.designpatterns.behavioral.state.HalfOpenState;
import com.farukbozan.projecte.designpatterns.behavioral.state.PassiveState;
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
