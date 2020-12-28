package com.sunth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sunth Sun
 * 2020/12/25 10:40 上午
 * other
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Value("${user.name}")
    private String name;

    @GetMapping("/test")
    public String get(){
        return name;
    }
}
