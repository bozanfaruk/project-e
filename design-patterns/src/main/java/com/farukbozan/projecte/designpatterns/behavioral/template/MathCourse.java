package com.farukbozan.projecte.designpatterns.behavioral.template;

import java.util.logging.Logger;

public class MathCourse extends Template {

    private static final Logger LOGGER = Logger.getLogger(MathCourse.class.getName());

    @Override
    protected void finalStep() {
        LOGGER.info("MathCourse final step");
    }
}
