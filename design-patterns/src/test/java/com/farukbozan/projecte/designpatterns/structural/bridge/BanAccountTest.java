package com.farukbozan.projecte.designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BanAccountTest {

    @Test
    void should_execute() {
        //GIVEN
        MoneyAccount aBankTLMoneyAccount = new TLAccount();
        MoneyAccount aBankEuroMoneyAccount = new EuroAccount();
        MoneyAccount bBankTLMoneyAccount = new TLAccount();

        BankAccount aBankTLAccount = new ABankAccount(aBankTLMoneyAccount);
        BankAccount aBankEuroAccount = new ABankAccount(aBankEuroMoneyAccount);
        BankAccount bBankTLAccount = new BBankAccount(bBankTLMoneyAccount);

        //WHEN
        aBankTLAccount.credit(50);
        aBankTLAccount.debit(10);

        aBankEuroAccount.debit(100);

        bBankTLAccount.credit(120);
        bBankTLAccount.debit(20);

        //THEN
        assertEquals(40, aBankTLAccount.getMoneyAccount().balance());
        assertEquals(-100, aBankEuroAccount.getMoneyAccount().balance());
        assertEquals(100, bBankTLAccount.getMoneyAccount().balance());

        assertThrows(InvalidAmountException.class, () -> bBankTLAccount.credit(5));
        assertThrows(InvalidAmountException.class, () -> bBankTLAccount.debit(2000));
    }

}
