package com.farukbozan.projecte.designpatterns.structural.facade;

public class BankAccountManager {

    public void debit(Account account, int amount) {
        if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
        }
    }

}
