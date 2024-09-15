package com.farukbozan.projecte.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CustomWindowComponent implements CustomComponent {

    private final List<CustomComponent> components = new ArrayList<>();

    @Override
    public void addComponent(CustomComponent customComponent) {
        components.add(customComponent);
    }

    @Override
    public int getBranchSize() {
        return components.size();
    }

}
