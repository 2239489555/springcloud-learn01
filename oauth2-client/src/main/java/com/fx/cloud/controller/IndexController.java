package com.fx.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 成东日
 * @date 2020/2/10 19:54
 */
@RestController
public class IndexController {
    @Autowired
    private UserController userController;

    @GetMapping("/")
    public Object index(Authentication authentication) {
        return userController.getCurrentUser(authentication);
    }
}
