package com.farukbozan.projecte.designpatterns.behavioral.mediator;

public class FlightTower implements Mediator {

    private boolean hasFlyingPlane = false;

    @Override
    public boolean callForPermission(Plane plane) {

        if (PlaneType.STATE.equals(plane.getPlaneType())) {
            return true;
        }

        if (!hasFlyingPlane) {
            hasFlyingPlane = true;
            return true;
        }

        return false;
    }

}
