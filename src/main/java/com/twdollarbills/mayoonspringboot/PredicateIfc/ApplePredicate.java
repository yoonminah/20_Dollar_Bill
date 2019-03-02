package com.twdollarbills.mayoonspringboot.PredicateIfc;

import com.twdollarbills.mayoonspringboot.vo.Apple;

public interface ApplePredicate {
    boolean test(Apple apple);
    default String printOut(Apple apple){
        return "test";
    }
}