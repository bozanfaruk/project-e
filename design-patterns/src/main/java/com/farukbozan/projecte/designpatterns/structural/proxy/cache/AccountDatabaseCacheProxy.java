package com.farukbozan.projecte.designpatterns.structural.proxy.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.Objects.isNull;

public class AccountDatabaseCacheProxy implements AccountRepo {

    private static final Logger LOGGER = Logger.getLogger(AccountDatabaseCacheProxy.class.getName());

    private final Map<Long, Account> accountCache = new HashMap<>();

    private final AccountRepo accountRepo;

    public AccountDatabaseCacheProxy(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Account getAccount(Long id) {
        var account = accountCache.get(id);
        if (isNull(account)) {
            account = accountRepo.getAccount(id);
            accountCache.put(id, account);
        } else {
            LOGGER.log(Level.INFO, "Retrieved account {0} {1} from cache", new Object[]{account.getId(), account.getName()});
        }
        return account;
    }

}
