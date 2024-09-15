package com.farukbozan.projecte.designpatterns.structural.composite;

public class CustomButtonComponent implements CustomComponent {

    @Override
    public void addComponent(CustomComponent customComponent) {
        // button has no sub components.
    }

    @Override
    public int getBranchSize() {
        return 0;
    }

}
