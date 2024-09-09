package com.farukbozan.projecte.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ButtonFactoryTest {

    @Test
    void should_get_button() {
        //GIVEN
        var swingButton = ButtonFactory.createButton(ButtonType.SWING);
        var awtButton = ButtonFactory.createButton(ButtonType.AWT);

        //WHEN

        //THEN
        assertEquals("Swing button", swingButton.getName());
        assertEquals("AWT button", awtButton.getName());

        assertDoesNotThrow(swingButton::onClick);
        assertThrows(UnsupportedOperationException.class, awtButton::onClick);
    }

}
