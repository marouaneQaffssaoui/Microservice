package com.example.departemtservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartemtServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartemtServiceApplication.class, args);
    }

}
