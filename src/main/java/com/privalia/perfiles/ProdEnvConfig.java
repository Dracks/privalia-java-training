package com.privalia.perfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
public class ProdEnvConfig {

    @Bean
    public User user(){
        return new User(123, "Dr Strange");
    }
}
