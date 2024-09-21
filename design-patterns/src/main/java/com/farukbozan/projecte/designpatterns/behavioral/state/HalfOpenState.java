package com.farukbozan.projecte.designpatterns.behavioral.state;

public class HalfOpenState implements CircuitBreakerState {

    @Override
    public boolean isActive(Context context) {
        return context.getCallCount() % 5 != 0;
    }
}
