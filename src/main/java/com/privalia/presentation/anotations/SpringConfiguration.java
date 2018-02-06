package com.privalia.presentation.anotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean(name = "helloWorld")
    public HelloWorld getHello(){
        return new HelloWorld();
    }

}
