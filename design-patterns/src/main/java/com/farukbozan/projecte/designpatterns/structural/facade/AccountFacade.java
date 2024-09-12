package com.farukbozan.projecte.designpatterns.structural.facade;

public class AccountFacade {

    private final Account account;

    private final BankAccountManager bankAccountManager;

    private final SMSManager smsManager;

    private final AccountLogMaanager accountLogMaanager;

    public AccountFacade(Account account, BankAccountManager bankAccountManager, SMSManager smsManager, AccountLogMaanager accountLogMaanager) {
        this.account = account;
        this.bankAccountManager = bankAccountManager;
        this.smsManager = smsManager;
        this.accountLogMaanager = accountLogMaanager;
    }

    public void executeTransaction(int amount) {
        bankAccountManager.debit(account, amount);
        smsManager.sendSMS(account);
        accountLogMaanager.logAccountTransaction(account, amount);
    }
}
