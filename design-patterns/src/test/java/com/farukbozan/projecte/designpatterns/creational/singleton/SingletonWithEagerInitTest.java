package com.farukbozan.projecte.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonWithEagerInitTest {

    @Test
    void should_return_singleton() {
        //GIVEN

        //WHEN
        var instance1 = SingletonWithEagerInit.getInstance();
        var instance2 = SingletonWithEagerInit.getInstance();

        //THEN
        assertEquals(instance1, instance2);
    }

}
