package com.praveen.depInject.serviceImpl;

import com.praveen.depInject.service.Coach;
import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practise bowling for 15 mins!";
    }
}
