package com.farukbozan.projecte.designpatterns.creational.factory;

public class ButtonFactory {

    private ButtonFactory() {
    }

    public static Button createButton(ButtonType buttonType) {
        return switch (buttonType) {
            case SWING -> new SwingButton();
            case AWT -> new AWTButton();
        };
    }

}
