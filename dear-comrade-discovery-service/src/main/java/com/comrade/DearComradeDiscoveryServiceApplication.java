package com.comrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DearComradeDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DearComradeDiscoveryServiceApplication.class, args);
    }

}