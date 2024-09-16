package com.farukbozan.projecte.designpatterns.behavioral.iterator;

import java.time.LocalDateTime;

public class CacheItemRepo implements CustomIteratorClass<CacheItem> {

    private final Iterator<CacheItem> iterator;

    public CacheItemRepo() {
        CacheItem[] cacheItems = new CacheItem[5];
        cacheItems[0] = new CacheItem(LocalDateTime.now().minusDays(3));
        cacheItems[1] = new CacheItem(LocalDateTime.now().minusDays(2));
        cacheItems[2] = new CacheItem(LocalDateTime.now().minusDays(1));
        cacheItems[3] = new CacheItem(LocalDateTime.now());
        cacheItems[4] = new CacheItem(LocalDateTime.now().plusDays(1));

        iterator = new CacheItemIterator(cacheItems);
    }

    @Override
    public Iterator<CacheItem> getIterator() {
        return iterator;
    }
}
