package com.praveen.depInject.config;


import com.praveen.depInject.service.Coach;
import com.praveen.depInject.serviceImpl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
