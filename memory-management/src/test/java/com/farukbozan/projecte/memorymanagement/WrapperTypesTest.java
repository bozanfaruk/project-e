package com.farukbozan.projecte.memorymanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WrapperTypesTest {

    @Test
    void should_get_wrapper_values() {
        //GIVEN
        var wrapperTypes = new WrapperTypes();

        //WHEN

        //THEN
        assertEquals(1, wrapperTypes.getIntValue());
        assertEquals(2, wrapperTypes.getLongValue());
        assertEquals(3, wrapperTypes.getFloatValue());
        assertEquals(4, wrapperTypes.getDoubleValue());
        assertEquals((short) 5, wrapperTypes.getShortValue());
        assertEquals((byte) 6, wrapperTypes.getByteValue());
        assertEquals('7', wrapperTypes.getCharacterValue());
        assertTrue(wrapperTypes.getBooleanValue());
    }

}
