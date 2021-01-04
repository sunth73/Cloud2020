package com.sunth.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Sunth Sun
 * 2020/12/28 4:02 下午
 * other
 */
@FeignClient(value = "server",contextId = "testservice")
@RequestMapping("/test")
public interface TestService {
    @GetMapping("/test")
    public String get();
}
