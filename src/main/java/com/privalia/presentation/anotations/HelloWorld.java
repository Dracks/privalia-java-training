package com.privalia.presentation.anotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Data
public class HelloWorld {
    @Autowired
    @Value("Hello world from annotations")
    private String hello;

    public HelloWorld(){
        this.hello=null;
    }

    public HelloWorld(String hello){
        this.hello = hello;
    }
}
