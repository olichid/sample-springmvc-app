package com.olichid.springdemo;

import org.springframework.stereotype.Component;

@Component//("thatSillyCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Pracice your backhand volley";
    }
}

