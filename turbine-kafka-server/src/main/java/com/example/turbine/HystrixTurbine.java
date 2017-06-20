package com.example.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class HystrixTurbine {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbine.class, args);
    }
}
