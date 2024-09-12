package com.farukbozan.projecte.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountFacadeTest {

    @Test
    void should_execute_transaction() {
        //GIVEN
        var account = new Account();
        var bankAccountManager = new BankAccountManager();
        var smsManager = new SMSManager();
        var accountLogMaanager = new AccountLogMaanager();
        var facade = new AccountFacade(account, bankAccountManager, smsManager, accountLogMaanager);

        //WHEN
        facade.executeTransaction(50);

        //THEN
        assertEquals(950, account.getBalance());
    }

}
