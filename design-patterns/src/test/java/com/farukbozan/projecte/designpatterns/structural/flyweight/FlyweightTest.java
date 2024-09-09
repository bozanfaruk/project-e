package com.farukbozan.projecte.designpatterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FlyweightTest {

    private static final int TREE_COUNT = 1000000;

    @Test
    void should_create_non_flyweight_object() {
        //GIVEN
        NonFlyweightTree[] nonFlyweightTrees = new NonFlyweightTree[TREE_COUNT];

        //WHEN
        long startMemory = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < TREE_COUNT; i++) {
            nonFlyweightTrees[i] = new NonFlyweightTree(i, i, "Green Tree", Color.GREEN);
        }
        long diffMemory = startMemory - Runtime.getRuntime().freeMemory();

        //THEN
        Logger.getLogger(FlyweightTest.class.getName()).info(String.valueOf(diffMemory));
        assertTrue(diffMemory > 0);
    }

    @Test
    void should_create_flyweight_object() {
        //GIVEN
        FlyweightTree[] flyweightTrees = new FlyweightTree[TREE_COUNT];
        IntrinsicTree intrinsicTree = new IntrinsicTree("Green Tree", Color.GREEN);

        //WHEN
        long startMemory = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < TREE_COUNT; i++) {
            flyweightTrees[i] = new FlyweightTree(i, i, intrinsicTree);
        }
        long diffMemory = startMemory - Runtime.getRuntime().freeMemory();

        //THEN
        Logger.getLogger(FlyweightTest.class.getName()).info(String.valueOf(diffMemory));
        assertTrue(diffMemory > 0);
    }
}
