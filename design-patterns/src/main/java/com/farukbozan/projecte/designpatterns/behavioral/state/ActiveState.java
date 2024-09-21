package com.farukbozan.projecte.designpatterns.behavioral.state;

public class ActiveState implements CircuitBreakerState {

    @Override
    public boolean isActive(Context context) {
        return true;
    }
}
