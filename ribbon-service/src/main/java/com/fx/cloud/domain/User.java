package com.fx.cloud.domain;

import lombok.Data;

/**
 * @author 成东日
 * @date 2020/2/9 19:54
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
