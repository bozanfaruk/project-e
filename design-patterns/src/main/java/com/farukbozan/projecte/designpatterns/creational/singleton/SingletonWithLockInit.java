package com.farukbozan.projecte.designpatterns.creational.singleton;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class SingletonWithLockInit {

    private static SingletonWithLockInit instance;

    private SingletonWithLockInit() {
    }

    public static SingletonWithLockInit getInstance() {

        SingletonWithLockInit result = instance;

        if (nonNull(result)) {
            return result;
        }

        synchronized (SingletonWithLockInit.class) {
            if (isNull(instance)) {
                instance = new SingletonWithLockInit();
            }
        }

        return instance;
    }
}
