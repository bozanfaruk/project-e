package com.farukbozan.projecte.designpatterns.behavioral.visitor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DownVisitor implements Visitor {

    private static final Logger LOGGER = Logger.getLogger(DownVisitor.class.getName());

    private static final String DOWN = "DOWN ON";

    public void visit(Foo foo) {
        LOGGER.log(Level.INFO, DOWN + " {1}", foo.getFoo());
    }

    public void visit(Bar bar) {
        LOGGER.log(Level.INFO, DOWN + " {0}", bar.getBar());
    }

    public void visit(Baz baz) {
        LOGGER.log(Level.INFO, DOWN + " {0}", baz.getBaz());
    }

}
