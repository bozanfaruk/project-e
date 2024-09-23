package com.farukbozan.projecte.designpatterns.behavioral.visitor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UpVisitor implements Visitor {

    private static final Logger LOGGER = Logger.getLogger(UpVisitor.class.getName());

    private static final String UP = "";

    public void visit(Foo foo) {
        LOGGER.log(Level.INFO, UP + " {0}", foo.getFoo());
    }

    public void visit(Bar bar) {
        LOGGER.log(Level.INFO, UP + " {0}", bar.getBar());
    }

    public void visit(Baz baz) {
        LOGGER.log(Level.INFO, UP + " {0}", baz.getBaz());
    }

}