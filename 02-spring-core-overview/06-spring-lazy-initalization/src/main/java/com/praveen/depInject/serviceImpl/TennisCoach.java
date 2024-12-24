package com.praveen.depInject.serviceImpl;

import com.praveen.depInject.service.Coach;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise serve for 2 hours!";
    }
}
