package com.farukbozan.projecte.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonWithLazyInitTest {

    @Test
    void should_return_singleton() {
        //GIVEN

        //WHEN
        var instance1 = SingletonWithLazyInit.getInstance();
        var instance2 = SingletonWithLazyInit.getInstance();

        //THEN
        assertEquals(instance1, instance2);
    }

}
