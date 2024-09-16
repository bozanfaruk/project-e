package com.farukbozan.projecte.designpatterns.behavioral.iterator;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class CacheItemIterator implements Iterator<CacheItem> {

    private final CacheItem[] cacheItems;

    private int index = 0;

    public CacheItemIterator(CacheItem[] cacheItems) {
        this.cacheItems = cacheItems;
    }

    @Override
    public boolean hasNext() {
        return nonNull(cacheItems) && cacheItems.length > 0 && index < cacheItems.length;
    }

    @Override
    public Optional<CacheItem> next() {
        Optional<CacheItem> cacheItem = index < cacheItems.length ? Optional.of(cacheItems[index]) : Optional.empty();
        index++;
        return cacheItem;
    }

    @Override
    public int size() {
        return nonNull(cacheItems) ? cacheItems.length : 0;
    }

}
