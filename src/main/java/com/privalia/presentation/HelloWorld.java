package com.privalia.presentation;

import lombok.Data;

@Data
public class HelloWorld {
    private String hello;

    public HelloWorld(){
        this.hello=null;
    }

    public HelloWorld(String hello){
        this.hello = hello;
    }
}
