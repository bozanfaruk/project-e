package com.farukbozan.projecte.designpatterns.behavioral.iterator;

import java.util.Optional;

public interface Iterator<T> {

    boolean hasNext();

    Optional<T> next();

    int size();

}
