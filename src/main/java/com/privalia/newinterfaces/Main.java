package com.privalia.newinterfaces;

public class Main {
    public static void main(String[] args){
        IStrategy strategy = (name) -> "Hello " + name;

        System.out.println(strategy.sayHelloTo("Oscar Blancart!"));
        System.out.println(strategy.sayHelloWord());
    }
}
