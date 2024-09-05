package com.farukbozan.projecte.designpatterns.creational.builder;

import java.util.List;

public class CVBuilder {

    private String name;

    private String surname;

    private int age;

    private String gender;

    private University university;

    private List<Hobby> hobbies;

    public CVBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CVBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public CVBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CVBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public CVBuilder setUniversity(University university) {
        this.university = university;
        return this;
    }

    public CVBuilder setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public CV build() {
        return new CV(name, surname, age, gender, university, hobbies);
    }
}
