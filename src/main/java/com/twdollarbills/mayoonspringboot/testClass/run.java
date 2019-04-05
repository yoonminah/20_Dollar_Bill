package com.twdollarbills.mayoonspringboot.testClass;

/*
* p.90
* */
public class run {

    //람다
    static Runnable r1= () -> System.out.println("Hi dude1!");

    //익명 클래스
    static Runnable  r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hi dude2! ");
        }
    };

    public static void process(Runnable r){
        r.run();
    }

    public static void main(String[] args){
        process(r1);
        process(r2);
        process(()-> System.out.println("Hi dude3!"));

    }
}
