package com.farukbozan.projecte.designpatterns.behavioral.state;

public interface CircuitBreakerState {

    boolean isActive(Context context);

}
