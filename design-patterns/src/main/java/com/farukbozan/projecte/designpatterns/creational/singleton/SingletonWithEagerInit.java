package com.farukbozan.projecte.designpatterns.creational.singleton;

public class SingletonWithEagerInit {

    private static final SingletonWithEagerInit INSTANCE = new SingletonWithEagerInit();

    private SingletonWithEagerInit() {
    }

    public static SingletonWithEagerInit getInstance() {
        return INSTANCE;
    }
}
