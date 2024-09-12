package com.farukbozan.projecte.designpatterns.structural.bridge;

public abstract class BankAccount {

    private final MoneyAccount moneyAccount;

    protected BankAccount(MoneyAccount moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public MoneyAccount getMoneyAccount() {
        return moneyAccount;
    }

    public abstract void credit(int amount);

    public abstract void debit(int amount);

}
