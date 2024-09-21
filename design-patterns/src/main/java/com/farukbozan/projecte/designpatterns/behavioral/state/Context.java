package com.farukbozan.projecte.designpatterns.behavioral.state;

public class Context {

    private int callCount = 0;

    private CircuitBreakerState circuitBreakerState;

    public int getCallCount() {
        return callCount;
    }

    public void incCallCount() {
        callCount++;
    }

    public void setCircuitBreakerState(CircuitBreakerState circuitBreakerState) {
        this.circuitBreakerState = circuitBreakerState;
    }

    public boolean callAPI() {
        incCallCount();
        return !circuitBreakerState.isActive(this);
    }
}
