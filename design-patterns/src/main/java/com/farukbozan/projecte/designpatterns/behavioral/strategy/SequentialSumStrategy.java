package com.farukbozan.projecte.designpatterns.behavioral.strategy;

public class SequentialSumStrategy implements SumStrategy {

    @Override
    public int sum(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            sum += i;
        }
        return sum;
    }

}
