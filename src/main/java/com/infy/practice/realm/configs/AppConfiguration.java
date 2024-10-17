package com.infy.practice.realm.configs;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfiguration {

    @Bean
    RestTemplate createRestTemplate(){
        return new RestTemplateBuilder().build();
    }

}
