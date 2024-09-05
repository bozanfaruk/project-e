package com.farukbozan.projecte.designpatterns.creational.builder;

import java.util.List;

public class CV {

    private final String name;

    private final String surname;

    private final int age;

    private final String gender;

    private final University university;

    private final List<Hobby> hobbies;

    public CV(String name, String surname, int age, String gender, University university, List<Hobby> hobbies) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.university = university;
        this.hobbies = hobbies;
    }

    public static CVBuilder builder() {
        return new CVBuilder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public University getUniversity() {
        return university;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }
}
