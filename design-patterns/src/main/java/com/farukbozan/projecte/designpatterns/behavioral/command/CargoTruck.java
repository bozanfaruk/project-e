package com.farukbozan.projecte.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CargoTruck {

    private final List<Cargo> cargos = new ArrayList<>();

    public List<Cargo> getCargos() {
        return cargos;
    }
}
