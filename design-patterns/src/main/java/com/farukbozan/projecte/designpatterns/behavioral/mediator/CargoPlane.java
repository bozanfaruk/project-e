package com.farukbozan.projecte.designpatterns.behavioral.mediator;

public class CargoPlane extends Plane {

    public CargoPlane(Mediator mediator) {
        super(mediator, PlaneType.CARGO);
    }

}
