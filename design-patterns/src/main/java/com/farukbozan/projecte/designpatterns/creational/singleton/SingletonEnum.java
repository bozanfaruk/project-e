package com.farukbozan.projecte.designpatterns.creational.singleton;

public enum SingletonEnum {

    INSTANCE,
    SECOND_INSTANCE;

    private final SingletonEnumClass singletonEnumClass;

    private SingletonEnum() {
        this.singletonEnumClass = new SingletonEnumClass();
    }
}
