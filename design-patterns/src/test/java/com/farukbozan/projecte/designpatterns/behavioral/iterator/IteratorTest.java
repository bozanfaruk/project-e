package com.farukbozan.projecte.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IteratorTest {

    @Test
    void should_iterate() {
        //GIVEN
        CustomIteratorClass<CacheItem> cacheItemRepo = new CacheItemRepo();
        Iterator<CacheItem> iterator = cacheItemRepo.getIterator();

        //WHEN
        int size = iterator.size();

        while (iterator.hasNext()) {
            assertTrue(iterator.next().isPresent());
        }

        //THEN
        assertEquals(5, size);
    }

}
