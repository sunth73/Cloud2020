package com.sunth.controller;

import com.sunth.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sunth Sun
 * 2020/12/28 4:07 下午
 * other
 */
@RestController
@RequestMapping("/get")
public class TestController {
    @Autowired
    private TestService service;
    @GetMapping("/get")
    public String get(){
        return service.get();
    }
}
