package com.farukbozan.projecte.designpatterns.creational.singleton;

import static java.util.Objects.isNull;

public class SingletonWithLazyInit {

    private static SingletonWithLazyInit instance;

    private SingletonWithLazyInit() {
    }

    public static SingletonWithLazyInit getInstance() {

        if (isNull(instance)) {
            instance = new SingletonWithLazyInit();
        }

        return instance;
    }
}
