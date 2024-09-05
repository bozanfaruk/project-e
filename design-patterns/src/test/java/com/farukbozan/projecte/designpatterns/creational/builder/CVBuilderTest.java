package com.farukbozan.projecte.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CVBuilderTest {

    @Test
    void should_build_full_cv() {
        //GIVEN

        //WHEN
        var cv = CV.builder()
                   .setName("Name")
                   .setSurname("Surname")
                   .setAge(25)
                   .setGender("F")
                   .setUniversity(new University("University"))
                   .setHobbies(List.of(new Hobby("Riding")))
                   .build();

        //THEN
        assertEquals("Name", cv.getName());
        assertEquals("Surname", cv.getSurname());
        assertEquals(25, cv.getAge());
        assertEquals("F", cv.getGender());

        assertNotNull(cv.getUniversity());
        assertFalse(cv.getHobbies().isEmpty());
    }

    @Test
    void should_build_incomplete_cv() {
        //GIVEN

        //WHEN
        var cv = CV.builder()
                   .setName("Name")
                   .setSurname("Surname")
                   .build();

        //THEN
        assertEquals("Name", cv.getName());
        assertEquals("Surname", cv.getSurname());
        assertEquals(0, cv.getAge());
        assertNull(cv.getGender());

        assertNull(cv.getUniversity());
        assertNull(cv.getHobbies());
    }
}
