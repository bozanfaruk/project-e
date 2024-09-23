package com.farukbozan.projecte.designpatterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class VisitorTest {

    @Test
    void should_execute_visitor() {
        //GIVEN
        Element[] list = {new Foo(), new Bar(), new Baz()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();

        //WHEN

        //THEN
        assertDoesNotThrow(() -> {
            for (Element element : list) {
                element.accept(up);
            }

            for (Element element : list) {
                element.accept(down);
            }
        });
    }

}
