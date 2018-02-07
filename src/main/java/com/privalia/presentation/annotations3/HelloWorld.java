package com.privalia.presentation.annotations3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component()
public class HelloWorld {
    private String hello;

    public HelloWorld(){
        this.hello=null;
    }

    @Autowired
    public HelloWorld(@Value("Hello world from constructor") String hello){
        this.hello = hello;
    }
}
