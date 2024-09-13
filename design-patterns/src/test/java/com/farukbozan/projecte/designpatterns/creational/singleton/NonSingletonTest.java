package com.farukbozan.projecte.designpatterns.creational.singleton;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NonSingletonTest {

    @Test
    void should_get_module_exception() {
        //GIVEN
        Gson gson = new Gson();
        var runtime = Runtime.getRuntime();

        //WHEN

        //THEN
        assertThrows(JsonIOException.class, () -> {
            gson.fromJson(gson.toJson(runtime), Runtime.class);
        });
    }

    @Test
    void should_get_non_singleton_with_gsonn() {
        //GIVEN
        SingletonWithEagerInit singletonInstance = SingletonWithEagerInit.getInstance();
        Gson gson = new Gson();

        //WHEN
        SingletonWithEagerInit newInstance = gson.fromJson(gson.toJson(singletonInstance), SingletonWithEagerInit.class);

        //THEN
        assertNotEquals(newInstance, singletonInstance);
    }

    @Test
    void should_get_non_singleton_with_reflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        //GIVEN
        SingletonWithEagerInit singletonInstance = SingletonWithEagerInit.getInstance();
        Constructor<?> declaredConstructor = SingletonWithEagerInit.class.getDeclaredConstructors()[0];
        declaredConstructor.setAccessible(true);

        //WHEN
        SingletonWithEagerInit newInstance = (SingletonWithEagerInit) declaredConstructor.newInstance();

        //THEN
        assertNotEquals(newInstance, singletonInstance);
    }

    @Test
    void should_get_singleton_with_enum() {
        //GIVEN

        //WHEN
        SingletonEnum firstInstance = SingletonEnum.INSTANCE;
        SingletonEnum secondInstance = SingletonEnum.INSTANCE;

        //THEN
        assertEquals(firstInstance, secondInstance);
    }

    @Test
    void should_get_non_singleton_with_enum() {
        //GIVEN

        //WHEN
        SingletonEnum firstInstance = SingletonEnum.INSTANCE;
        SingletonEnum secondInstance = SingletonEnum.SECOND_INSTANCE;

        //THEN
        assertNotEquals(firstInstance, secondInstance);
    }

}
