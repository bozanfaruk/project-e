package com.farukbozan.projecte.designpatterns.creational.abstractfactory;

public class UIFactory {

    private UIFactory() {
    }

    public static ComponentFactory getComponentFactory(OSType osType) {
        return switch (osType) {
            case OSType.UBUNTU -> new UbuntuComponentFactory();
            case OSType.MINT -> new MintComponentFactory();
        };
    }

}
