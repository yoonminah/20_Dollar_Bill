package com.twdollarbills.mayoonspringboot.testClass;

import java.util.ArrayList;
import java.util.List;

import com.twdollarbills.mayoonspringboot.PredicateIfc.ApplePredicate;
import com.twdollarbills.mayoonspringboot.vo.Apple;

/*
* Quiz 2-1 p 71
* */
public class PrettyPrintApple {
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<String> prettyPrintApple(List<Apple> inventory, ApplePredicate p){
        List<String> result = new ArrayList<String>();
        for (Apple apple: inventory){
            String output = p.printOut(apple);
            System.out.println(output);
            result.add(output);
        }
        return result;
    }
}
