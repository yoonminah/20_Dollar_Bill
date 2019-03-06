package com.twdollarbills.mayoonspringboot.testClass;

import com.twdollarbills.mayoonspringboot.vo.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args){
        List<Apple> apples = Arrays.asList(new Apple(33, "green")
                , new Apple(333, "red")
                , new Apple(177, "green"));


        Thread t = new Thread(new Runnable() {
            public void run() {
                apples.sort(new Comparator<Apple>() {
                    public int compare(Apple a1, Apple a2) {
                        return a1.getColor().compareTo(a2.getColor());
                    }
                });

                for(Apple a :apples) {
                    System.out.println("A "+a.getColor()+" apple is "+ a.getWeight()+"g in t" );
                }
            }
        });


        /*
        * compareTo Integer타입 비교만 가능
        * 람다 표현식
        * */
        Thread tt =  new Thread(()->{ apples.sort((Apple a1, Apple a2)-> a1.getWeight().compareTo(a2.getWeight()));
                                        for(Apple a :apples) System.out.println("A "+a.getColor()+" apple is "+ a.getWeight()+"g in tt" );
            System.out.println("TT");
        });

        t.run();
        tt.run();

        /*for(Apple a :apples) {
            System.out.println("A "+a.getColor()+" apple is "+ a.getWeight()+"g " );
        }*/
    }
}
