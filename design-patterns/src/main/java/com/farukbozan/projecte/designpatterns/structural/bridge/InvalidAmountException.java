package com.farukbozan.projecte.designpatterns.structural.bridge;

public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException() {
        super("Invalid amount for execution");
    }

}
