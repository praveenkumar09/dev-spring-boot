package com.praveen.depInject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.praveen.depInject",
        "com.praveen.service"})
public class DepInjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepInjectApplication.class, args);
    }

}
