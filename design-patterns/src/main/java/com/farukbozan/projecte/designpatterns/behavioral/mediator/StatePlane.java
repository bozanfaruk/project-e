package com.farukbozan.projecte.designpatterns.behavioral.mediator;

public class StatePlane extends Plane {

    public StatePlane(Mediator mediator) {
        super(mediator, PlaneType.STATE);
    }

}
