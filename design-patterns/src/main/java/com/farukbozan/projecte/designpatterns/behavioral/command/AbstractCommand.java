package com.farukbozan.projecte.designpatterns.behavioral.command;

public abstract class AbstractCommand {

    protected CargoTruck cargoTruck;

    protected Cargo cargo;

    protected AbstractCommand(CargoTruck cargoTruck, Cargo cargo) {
        this.cargoTruck = cargoTruck;
        this.cargo = cargo;
    }

    abstract boolean execute();

}
