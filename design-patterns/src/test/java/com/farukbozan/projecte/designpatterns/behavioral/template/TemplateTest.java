package com.farukbozan.projecte.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TemplateTest {

    @Test
    void should_execute_template() {
        //GIVEN
        Template computerCourse = new ComputerCourse();
        Template mathCourse = new MathCourse();
        Template networkCourse = new NetworkCourse();

        //WHEN

        //THEN
        assertDoesNotThrow(computerCourse::completeCourse);
        assertDoesNotThrow(mathCourse::completeCourse);

        assertThrows(UnsupportedOperationException.class, networkCourse::completeCourse);
    }

}
