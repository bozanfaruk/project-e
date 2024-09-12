package com.farukbozan.projecte.designpatterns.structural.bridge;

public interface MoneyAccount {

    int balance();

    void debit(int amount);

    void credit(int amount);

}
