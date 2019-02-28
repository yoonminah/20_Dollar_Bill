package com.twdollarbills.mayoonspringboot.vo;

public class Apple {
    String color = "";
    Integer weight = 0;

    public String getColor() {
        return color;
    }
    public Integer getWeight() {
        return weight;
    }

    public Apple(Integer weight, String color){
        this.weight = weight;
        this.color = color;
    }
}
