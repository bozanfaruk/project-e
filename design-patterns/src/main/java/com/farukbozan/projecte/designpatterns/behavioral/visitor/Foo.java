package com.farukbozan.projecte.designpatterns.behavioral.visitor;

public class Foo implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFoo() {
        return "Foo";
    }

}