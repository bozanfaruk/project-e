package com.farukbozan.projecte.designpatterns.structural.proxy.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountDatabaseCacheProxyTest {

    @Test
    void should_cache_proxy() {
        //GIVEN
        AccountRepo accountDatabaseRepo = new AccountDatabase();
        AccountRepo accountDatabaseCacheProxy = new AccountDatabaseCacheProxy(accountDatabaseRepo);

        //WHEN
        var account = accountDatabaseCacheProxy.getAccount(2L);
        var proxyAccount = accountDatabaseCacheProxy.getAccount(2L);

        //THEN
        assertEquals(account, proxyAccount);
    }

}
