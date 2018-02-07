package com.privalia.presentation.configuration;

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
