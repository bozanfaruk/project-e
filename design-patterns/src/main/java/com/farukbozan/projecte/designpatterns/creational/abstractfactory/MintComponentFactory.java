package com.farukbozan.projecte.designpatterns.creational.abstractfactory;

public class MintComponentFactory implements ComponentFactory {

    @Override
    public Button createButton() {
        return new MintButton();
    }

    @Override
    public Checkbox createdCheckBox() {
        return new MintCheckbox();
    }
}
