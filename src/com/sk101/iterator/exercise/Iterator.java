package com.sk101.iterator.exercise;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();

}
