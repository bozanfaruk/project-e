package com.farukbozan.projecte.designpatterns.structural.bridge;

public class ABankAccount extends BankAccount {

    public ABankAccount(MoneyAccount moneyAccount) {
        super(moneyAccount);
    }

    @Override
    public void credit(int amount) {
        this.getMoneyAccount().credit(amount);
    }

    @Override
    public void debit(int amount) {
        this.getMoneyAccount().debit(amount);
    }
}
