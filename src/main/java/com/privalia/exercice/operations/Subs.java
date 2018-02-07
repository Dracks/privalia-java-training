package com.privalia.exercice.operations;

import org.springframework.stereotype.Component;

@Component(value = "-")
public class Subs implements IOperations {
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
