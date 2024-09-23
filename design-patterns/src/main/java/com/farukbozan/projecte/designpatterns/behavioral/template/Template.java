package com.farukbozan.projecte.designpatterns.behavioral.template;

import java.util.logging.Logger;

public abstract class Template {

    private static final Logger LOGGER = Logger.getLogger(Template.class.getName());

    public void completeCourse() {
        firstStep();
        secondStep();
        finalStep();
    }

    private void firstStep() {
        LOGGER.info("First Step");
    }

    private void secondStep() {
        LOGGER.info("Second Step");
    }

    protected abstract void finalStep();

}
