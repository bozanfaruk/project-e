package com.farukbozan.projecte.designpatterns.structural.flyweight;

public class FlyweightTree {

    private int x;

    private int y;

    private ExtrinsicTree extrinsicTree;

    public FlyweightTree(int x, int y, ExtrinsicTree extrinsicTree) {
        this.x = x;
        this.y = y;
        this.extrinsicTree = extrinsicTree;
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

    public ExtrinsicTree getIntrinsicTree() {
        return extrinsicTree;
    }

    public void setIntrinsicTree(ExtrinsicTree extrinsicTree) {
        this.extrinsicTree = extrinsicTree;
    }

}
