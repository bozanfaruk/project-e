package com.farukbozan.projecte.designpatterns.behavioral.visitor;

public class Baz implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBaz() {
        return "Baz";
    }

}
