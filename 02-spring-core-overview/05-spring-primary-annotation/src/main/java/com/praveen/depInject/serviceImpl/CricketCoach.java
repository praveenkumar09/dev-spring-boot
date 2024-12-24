package com.praveen.depInject.serviceImpl;

import com.praveen.depInject.service.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise batting 5h per day!";
    }
}
