package com.farukbozan.projecte.designpatterns.behavioral.mediator;

public abstract class Plane {

    private final Mediator mediator;

    private final PlaneType planeType;

    protected Plane(Mediator mediator, PlaneType planeType) {
        this.mediator = mediator;
        this.planeType = planeType;
    }

    public boolean callForLanding() {
        return mediator.callForPermission(this);
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
}
