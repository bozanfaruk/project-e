package com.farukbozan.projecte.memorymanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefensiveCopyTest {

    @Test
    void should_defensive_copy() {
        //GIVEN
        var nonDefensiveCopy = new NonDefensiveCopy();
        var defensiveCopy = new DefensiveCopy();

        //WHEN
        var nonDefensiveCopyString = nonDefensiveCopy.getBuilder().append("B").append("C").toString();
        var defensiveCopyString = defensiveCopy.getBuilder().toString();

        //THEN
        assertEquals("ABC", nonDefensiveCopyString);
        assertEquals("A", defensiveCopyString);
    }

}
