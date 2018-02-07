package com.privalia.presentation.annotations2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value="helloWorld")
@Data
public class HelloWorld {

    private String hello;

    @Autowired
    @Value("Hello world from annotations2")
    private void setHello(String h){
        this.hello = h;
    }

    public HelloWorld(){
        this.hello=null;
    }

    public HelloWorld(String hello){
        this.hello = hello;
    }
}
