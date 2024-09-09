package com.farukbozan.projecte.designpatterns.structural.flyweight;

import java.awt.Color;

public class NonFlyweightTree {

    private int x;

    private int y;

    private String name;

    private Color color;

    public NonFlyweightTree(int x, int y, String name, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
