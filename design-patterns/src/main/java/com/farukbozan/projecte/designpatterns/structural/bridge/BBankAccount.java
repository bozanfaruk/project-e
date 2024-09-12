package com.farukbozan.projecte.designpatterns.structural.bridge;

public class BBankAccount extends BankAccount {

    public BBankAccount(MoneyAccount moneyAccount) {
        super(moneyAccount);
    }

    @Override
    public void credit(int amount) {
        if (amount < 10) {
            throw new InvalidAmountException();
        }

        this.getMoneyAccount().credit(amount);
    }

    @Override
    public void debit(int amount) {
        if (amount > getMoneyAccount().balance()) {
            throw new InvalidAmountException();
        }

        this.getMoneyAccount().debit(amount);
    }
}
