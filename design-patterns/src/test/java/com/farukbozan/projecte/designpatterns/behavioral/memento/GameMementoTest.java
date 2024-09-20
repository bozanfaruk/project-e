package com.farukbozan.projecte.designpatterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameMementoTest {

    @Test
    void should_execute_memento() {
        //GIVEN
        var gameOriginator = new GameOriginator();

        //WHEN
        gameOriginator.levelUp();
        gameOriginator.levelUp();
        var saved = gameOriginator.save();

        //THEN
        assertEquals(2, gameOriginator.getLevel());
        assertEquals(2000, gameOriginator.getScore());

        //WHEN
        gameOriginator.fail();

        //THEN
        assertEquals(0, gameOriginator.getLevel());
        assertEquals(0, gameOriginator.getScore());

        //WHEN
        gameOriginator.restore(saved);

        //THEN

        //THEN
        assertEquals(2, gameOriginator.getLevel());
        assertEquals(2000, gameOriginator.getScore());
    }

}
