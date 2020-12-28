package com.sunth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Sunth Sun
 * 2020/12/24 6:50 下午
 * other
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sunth.service")
public class Client7001Application {
    public static void main(String[] args) {
        SpringApplication.run(Client7001Application.class,args);
    }
}
