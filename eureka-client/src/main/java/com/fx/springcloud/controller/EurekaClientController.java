package com.fx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 成东日
 * @date 2020/2/9 19:33
 */
@RestController
@RequestMapping("/client")
public class EurekaClientController {

    @Value("${spring.application.name}")
    private String serviceId;
    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/info")
    public Object info() {
        return "Info from service:" + serviceId + " port:" + servicePort+"!";
    }
}
