package com.praveen.depInject.serviceImpl;

import com.praveen.depInject.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketCoach implements Coach {

    @PostConstruct
    public void init(){
        System.out.println("Bean is initialized");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise batting 5h per day!";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean is destroyed");
    }
}
