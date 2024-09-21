package com.farukbozan.projecte.designpatterns.behavioral.state;

public class PassiveState implements CircuitBreakerState {

    @Override
    public boolean isActive(Context context) {
        return false;
    }
}
