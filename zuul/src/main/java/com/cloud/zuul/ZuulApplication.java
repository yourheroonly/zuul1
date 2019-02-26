package com.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
//@EnableEurekaClient
//@EnableZuulProxy
public class ZuulApplication {

    public static void main(String[] args) {
//        Bootstrap bootstrap = new Bootstrap();
//        bootstrap.start();
        SpringApplication.run(ZuulApplication.class, args);
    }

}

