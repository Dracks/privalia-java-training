package com.privalia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class SpringCloudConfigServerApplication{
    public static void main(String[] args){
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }
}