package com.farukbozan.projecte.designpatterns.behavioral.mediator;

public class CommercialPlane extends Plane {

    public CommercialPlane(Mediator mediator) {
        super(mediator, PlaneType.COMMERCIAL);
    }

}
