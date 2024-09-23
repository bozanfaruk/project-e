package com.farukbozan.projecte.designpatterns.behavioral.strategy;

public class FormulaSumStrategy implements SumStrategy {

    @Override
    public int sum(int limit) {
        return (limit * (limit + 1)) / 2;
    }

}
