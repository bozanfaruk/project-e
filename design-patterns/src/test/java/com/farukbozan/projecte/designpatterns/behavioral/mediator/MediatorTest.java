package com.farukbozan.projecte.designpatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MediatorTest {

    @Test
    void should_execute_mediator() {
        //GIVEN
        var tower = new FlightTower();

        var statePlane = new StatePlane(tower);
        var commercialPlane = new CommercialPlane(tower);
        var cargoPlane = new CargoPlane(tower);

        //WHEN
        boolean commercialPlaneResult = commercialPlane.callForLanding();
        boolean cargoPlaneResult = cargoPlane.callForLanding();
        boolean statePlaneResult = statePlane.callForLanding();

        //THEN

        assertTrue(commercialPlaneResult);
        assertFalse(cargoPlaneResult);
        assertTrue(statePlaneResult);
    }

}
