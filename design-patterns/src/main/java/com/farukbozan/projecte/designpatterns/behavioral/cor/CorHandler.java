package com.farukbozan.projecte.designpatterns.behavioral.cor;

public interface CorHandler {

    void setNextCorHandler(CorHandler nextCorHandler);

    boolean handle(Patient patient);
}
