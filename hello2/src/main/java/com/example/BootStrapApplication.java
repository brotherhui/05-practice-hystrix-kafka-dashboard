package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class BootStrapApplication {

    @Autowired
    private Hello3Service hello3Service;

	
    public static void main(String[] args) {
        SpringApplication.run(BootStrapApplication.class, args);
    }

    @RequestMapping(path = "/hello2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello2() {
        return "-> Hello World 2"+ hello3Service.callHello3();
    }

}
