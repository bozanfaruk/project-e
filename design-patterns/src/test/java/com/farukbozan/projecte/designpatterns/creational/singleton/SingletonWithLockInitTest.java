package com.farukbozan.projecte.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonWithLockInitTest {

    @Test
    void should_return_singleton() {
        //GIVEN

        //WHEN
        var instance1 = SingletonWithLockInit.getInstance();
        var instance2 = SingletonWithLockInit.getInstance();

        //THEN
        assertEquals(instance1, instance2);
    }

}
