package com.farukbozan.projecte.designpatterns.structural.proxy.cache;

import java.util.Map;

public class AccountDatabase implements AccountRepo {

    private static final Map<Long, Account> ACCOUNTS;

    static {
        ACCOUNTS = Map.of(1L, new Account(1L, "Account-1"),
                          2L, new Account(2L, "Account-2"),
                          3L, new Account(3L, "Account-3"),
                          4L, new Account(4L, "Account-4"),
                          5L, new Account(5L, "Account-5"));
    }

    @Override
    public Account getAccount(Long id) {
        return ACCOUNTS.get(id);
    }

}
