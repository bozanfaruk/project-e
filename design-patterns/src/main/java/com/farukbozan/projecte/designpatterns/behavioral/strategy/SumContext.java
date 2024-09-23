package com.farukbozan.projecte.designpatterns.behavioral.strategy;

public class SumContext {

    private SumStrategy sumStrategy;

    public void setSumStrategy(SumStrategy sumStrategy) {
        this.sumStrategy = sumStrategy;
    }

    public int sum(int limit) {
        return sumStrategy.sum(limit);
    }

}
