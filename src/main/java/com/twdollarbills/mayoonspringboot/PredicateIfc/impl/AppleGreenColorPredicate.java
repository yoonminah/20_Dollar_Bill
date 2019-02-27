package com.twdollarbills.mayoonspringboot.PredicateIfc.impl;

import com.twdollarbills.mayoonspringboot.PredicateIfc.ApplePredicate;
import com.twdollarbills.mayoonspringboot.vo.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return "green".equals(apple.getColor());
    }
    public String printOut(Apple apple){
        return "green".equals(apple.getColor()) ? apple.getColor() + " is A green apple": apple.getColor() + " is A none green apple";
    }
}
