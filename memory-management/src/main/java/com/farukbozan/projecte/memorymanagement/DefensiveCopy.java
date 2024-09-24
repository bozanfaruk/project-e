package com.farukbozan.projecte.memorymanagement;

public class DefensiveCopy {

    private final StringBuilder builder = new StringBuilder("A");

    public StringBuilder getBuilder() {
        return new StringBuilder(builder.toString());
    }
}
