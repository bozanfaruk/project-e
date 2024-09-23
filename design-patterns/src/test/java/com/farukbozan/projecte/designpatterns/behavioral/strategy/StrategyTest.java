package com.farukbozan.projecte.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyTest {

    @Test
    void should_change_strategy() {
        //GIVEN
        var formulaSumStrategy = new FormulaSumStrategy();
        var sequentialSumStrategy = new SequentialSumStrategy();
        var sumContext = new SumContext();

        //WHEN
        sumContext.setSumStrategy(formulaSumStrategy);
        int sum = sumContext.sum(10);

        //THEN
        assertEquals(55, sum);

        //WHEN
        sumContext.setSumStrategy(sequentialSumStrategy);
        sum = sumContext.sum(10);

        //THEN
        assertEquals(55, sum);
    }

}
