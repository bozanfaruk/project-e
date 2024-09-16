package com.farukbozan.projecte.designpatterns.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractCommandTest {

    @Test
    void should_execute_command() {
        //GIVEN
        NotificationService notificationService = new NotificationService();

        CargoTruck cargoTruck = new CargoTruck();

        Cargo cargo1 = new Cargo("cargo1");
        Cargo cargo2 = new Cargo("cargo2");
        Cargo cargo3 = new Cargo("cargo3");
        Cargo cargo4 = new Cargo("cargo4");

        AbstractCommand loadCargo1 = new CargoLoadAbstractCommand(cargoTruck, cargo1);
        AbstractCommand loadCargo2 = new CargoLoadAbstractCommand(cargoTruck, cargo2);
        AbstractCommand loadCargo3 = new CargoLoadAbstractCommand(cargoTruck, cargo3);
        AbstractCommand loadCargo4 = new CargoLoadAbstractCommand(cargoTruck, cargo4);

        AbstractCommand unloadCargo2 = new CargoUnloadAbstractCommand(cargoTruck, cargo2, notificationService);
        AbstractCommand unloadCargo4 = new CargoUnloadAbstractCommand(cargoTruck, cargo4, notificationService);

        //WHEN
        loadCargo1.execute();
        loadCargo2.execute();
        loadCargo3.execute();
        boolean executed = loadCargo4.execute();

        //THEN
        assertEquals(3, cargoTruck.getCargos().size());
        assertFalse(executed);

        //WHEN
        executed = unloadCargo4.execute();

        //THEN
        assertFalse(executed);

        //WHEN
        executed = unloadCargo2.execute();

        //THEN
        assertTrue(executed);
        assertEquals(2, cargoTruck.getCargos().size());

    }

}
