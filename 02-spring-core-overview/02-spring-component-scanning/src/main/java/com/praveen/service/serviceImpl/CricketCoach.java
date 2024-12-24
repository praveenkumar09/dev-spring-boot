package com.praveen.service.serviceImpl;

import com.praveen.service.service.Coach;
import org.springframework.stereotype.Component;


@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practise batting 5h per day";
    }
}
