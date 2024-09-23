package com.farukbozan.projecte.designpatterns.behavioral.template;

import java.util.logging.Logger;

public class ComputerCourse extends Template {

    private static final Logger LOGGER = Logger.getLogger(ComputerCourse.class.getName());

    @Override
    protected void finalStep() {
        LOGGER.info("ComputerCourse final step");
    }
}
