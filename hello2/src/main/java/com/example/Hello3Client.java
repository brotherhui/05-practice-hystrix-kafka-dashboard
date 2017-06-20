package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello3",
url = "http://localhost:9093")
public interface Hello3Client {

    @RequestMapping(method = RequestMethod.GET, value = "/hello3", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String hello3();

}
