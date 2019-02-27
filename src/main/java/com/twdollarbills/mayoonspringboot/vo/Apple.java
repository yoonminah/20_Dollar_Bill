package com.twdollarbills.mayoonspringboot.vo;

public class Apple {
    String color = "";
    int weight = 0;

    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }

    public Apple(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
}
