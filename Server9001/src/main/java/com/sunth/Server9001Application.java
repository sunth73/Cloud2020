package com.sunth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Sunth Sun
 * 2020/12/24 6:31 下午
 * other
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Server9001Application.class,args);
    }
}
