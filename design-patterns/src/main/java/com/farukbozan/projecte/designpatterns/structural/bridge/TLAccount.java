package com.farukbozan.projecte.designpatterns.structural.bridge;

public class TLAccount implements MoneyAccount {

    private int tlBalance = 0;

    @Override
    public int balance() {
        return this.tlBalance;
    }

    @Override
    public void debit(int amount) {
        this.tlBalance -= amount;
    }

    @Override
    public void credit(int amount) {
        this.tlBalance += amount;
    }
}
