package com.powerstartion.subscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsSubscriptionApplication {

    public static void main(String[] args) {

        SpringApplication.run(MsSubscriptionApplication.class, args);
    }

}
