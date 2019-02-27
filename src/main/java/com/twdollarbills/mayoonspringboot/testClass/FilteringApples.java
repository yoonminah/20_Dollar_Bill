package com.twdollarbills.mayoonspringboot.testClass;

import com.twdollarbills.mayoonspringboot.PredicateIfc.ApplePredicate;
import com.twdollarbills.mayoonspringboot.PredicateIfc.Predicate;
import com.twdollarbills.mayoonspringboot.vo.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* p.73 ~ p.78
* */
public class FilteringApples {
    public static void main(String[] args){
        List<Apple> inventory = Arrays.asList(new Apple(60,"green")
                                            , new Apple(155,"green")
                                            , new Apple(120, "red"));
/*
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
        List<Apple> redApples = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        */
        List<Apple> redApples = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        for(Apple a: redApples) System.out.println(a.getColor()+", "+a.getWeight());

        List<Integer> numbers = Arrays.asList(new Integer(60)
                                            , new Integer(155)
                                            , new Integer(120));
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i%2==0 );
        for(Integer i: evenNumbers) System.out.println(i);
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e: list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
