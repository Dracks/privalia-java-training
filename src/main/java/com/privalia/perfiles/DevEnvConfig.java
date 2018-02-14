package com.privalia.perfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevEnvConfig {
    @Bean
    public User user(){
        return new User(1111, "Dev User");
    }
}
