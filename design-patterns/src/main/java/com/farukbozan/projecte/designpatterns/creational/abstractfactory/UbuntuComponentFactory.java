package com.farukbozan.projecte.designpatterns.creational.abstractfactory;

public class UbuntuComponentFactory implements ComponentFactory {

    @Override
    public Button createButton() {
        return new UbuntuButton();
    }

    @Override
    public Checkbox createdCheckBox() {
        return new UbuntuCheckbox();
    }
}
