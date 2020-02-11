package com.fx.springcloud.service;

import com.fx.springcloud.domain.User;

import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/9 19:55
 */
public interface UserService {
    /**
     * 创建
     *
     * @param user 用户
     */
    void create(User user);

    /**
     * 获取用户
     *
     * @param id id
     * @return {@link User}
     */
    User getUser(Long id);

    /**
     * 更新
     *
     * @param user 用户
     */
    void update(User user);

    /**
     * 删除
     *
     * @param id id
     */
    void delete(Long id);

    /**
     * 得到用户名
     *
     * @param username 用户名
     * @return {@link User}
     */
    User getByUsername(String username);

    /**
     * 获取用户的id
     *
     * @param ids id
     * @return {@link List<User>}
     */
    List<User> getUserByIds(List<Long> ids);
}
