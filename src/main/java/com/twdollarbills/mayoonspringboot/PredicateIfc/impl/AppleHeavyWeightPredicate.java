package com.twdollarbills.mayoonspringboot.PredicateIfc.impl;

import com.twdollarbills.mayoonspringboot.PredicateIfc.ApplePredicate;
import com.twdollarbills.mayoonspringboot.vo.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }
    public String printOut(Apple apple){
        return apple.getWeight() > 150 ? apple.getWeight() + "g is A Heavy apple":apple.getWeight() + "g is A light apple";
    }
}
