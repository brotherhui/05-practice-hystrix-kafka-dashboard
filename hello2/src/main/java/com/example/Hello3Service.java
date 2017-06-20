package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class Hello3Service {

    @Autowired
    private Hello3Client hello3Client;
	
	@HystrixCommand(fallbackMethod = "fallbackA")
	public String callHello3(){
		return hello3Client.hello3();
	}
	
	public String fallbackA(Throwable e){
		return "call hello3 fallback";
	}
}
