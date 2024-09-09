package com.farukbozan.projecte.designpatterns.structural.flyweight;

public class FlyweightTree {

    private int x;

    private int y;

    private IntrinsicTree intrinsicTree;

    public FlyweightTree(int x, int y, IntrinsicTree intrinsicTree) {
        this.x = x;
        this.y = y;
        this.intrinsicTree = intrinsicTree;
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

    public IntrinsicTree getIntrinsicTree() {
        return intrinsicTree;
    }

    public void setIntrinsicTree(IntrinsicTree intrinsicTree) {
        this.intrinsicTree = intrinsicTree;
    }

}
