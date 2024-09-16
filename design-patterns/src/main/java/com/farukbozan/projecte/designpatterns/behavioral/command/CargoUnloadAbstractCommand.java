package com.farukbozan.projecte.designpatterns.behavioral.command;

public class CargoUnloadAbstractCommand extends AbstractCommand {

    private final NotificationService notificationService;

    public CargoUnloadAbstractCommand(CargoTruck cargoTruck, Cargo cargo, NotificationService notificationService) {
        super(cargoTruck, cargo);
        this.notificationService = notificationService;
    }

    @Override
    public boolean execute() {
        boolean removed = cargoTruck.getCargos().remove(cargo);
        if (removed) {
            notificationService.notifyCargoUnload(cargo);
        }
        return removed;
    }

}
