package com.farukbozan.projecte.designpatterns.behavioral.cor;

import static java.util.Objects.nonNull;

public class CardiacDoctor implements CorHandler {

    private CorHandler nextHandler;

    @Override
    public void setNextCorHandler(CorHandler nextCorHandler) {
        this.nextHandler = nextCorHandler;
    }

    @Override
    public boolean handle(Patient patient) {
        return PatientType.CARDIAC.equals(patient.type()) || (nonNull(nextHandler) && nextHandler.handle(patient));
    }
}
