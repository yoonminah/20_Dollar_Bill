package com.twdollarbills.mayoonspringboot.PredicateIfc;

public interface Predicate<T> {
    boolean test(T t);
}