package com.praveen.spring_boot.demo.mycoolapp.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${coach.name}")
    private String name;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/coachName")
    public String coachName() {
        return name;
    }

    @GetMapping("/teamName")
    public String teamName() {
        return teamName;
    }
}
