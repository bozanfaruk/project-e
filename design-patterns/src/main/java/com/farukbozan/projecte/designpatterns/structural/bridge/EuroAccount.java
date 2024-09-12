package com.farukbozan.projecte.designpatterns.structural.bridge;

public class EuroAccount implements MoneyAccount {

    private int euroBalance = 0;

    @Override
    public int balance() {
        return this.euroBalance;
    }

    @Override
    public void debit(int amount) {
        this.euroBalance -= amount;
    }

    @Override
    public void credit(int amount) {
        this.euroBalance += amount;
    }
}
