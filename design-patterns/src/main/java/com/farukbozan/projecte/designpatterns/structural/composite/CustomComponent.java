package com.farukbozan.projecte.designpatterns.structural.composite;

public interface CustomComponent {

    void addComponent(CustomComponent customComponent);

    int getBranchSize();

}
