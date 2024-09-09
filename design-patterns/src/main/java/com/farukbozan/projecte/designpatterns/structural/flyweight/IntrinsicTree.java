package com.farukbozan.projecte.designpatterns.structural.flyweight;

import java.awt.Color;

public class IntrinsicTree {

    private final String name;

    private final Color color;

    public IntrinsicTree(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

}
