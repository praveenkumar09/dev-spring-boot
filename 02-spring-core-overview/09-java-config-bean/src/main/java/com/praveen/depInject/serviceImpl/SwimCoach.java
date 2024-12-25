package com.praveen.depInject.serviceImpl;

import com.praveen.depInject.service.Coach;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Perform swimming 1000 meters";
    }
}
