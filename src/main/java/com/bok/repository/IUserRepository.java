package com.bok.repository;

import com.bok.entity.user.UserInfo;
import org.springframework.stereotype.Component;

/**
 * 用户表操作接口
 */
@Component
public interface IUserRepository {

    /**
     *
     * 通过用户名查找用户
     * @param username 用户名
     * @return 用户信息
     */
    UserInfo findByUsername(String username);

}
