package com.farukbozan.projecte.designpatterns.behavioral.command;

import java.util.logging.Logger;

public class CargoLoadAbstractCommand extends AbstractCommand {

    private static final Logger LOGGER = Logger.getLogger(CargoLoadAbstractCommand.class.getName());

    public CargoLoadAbstractCommand(CargoTruck cargoTruck, Cargo cargo) {
        super(cargoTruck, cargo);
    }

    @Override
    public boolean execute() {
        if (cargoTruck.getCargos().size() >= 3) {
            LOGGER.warning("Cargo truck is full. Try loading to another truck!!!");
            return false;
        }
        cargoTruck.getCargos().add(cargo);
        return true;
    }

}
