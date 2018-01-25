package com.privalia.newinterfaces;

@FunctionalInterface
public interface IStrategy {
    String sayHelloTo(String name);

    default String sayHelloWord(){
        return "Hello word";
    }
}
