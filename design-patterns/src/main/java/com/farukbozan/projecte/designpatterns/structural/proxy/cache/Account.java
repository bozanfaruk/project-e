package com.farukbozan.projecte.designpatterns.structural.proxy.cache;

public class Account {

    private final Long id;

    private final String name;

    public Account(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
