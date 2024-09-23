package com.farukbozan.projecte.designpatterns.behavioral.visitor;

public class Bar implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBar() {
        return "Bar";
    }

}
