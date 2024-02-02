package org.frank.spring.aop.target.impl;

import org.frank.spring.aop.target.UserService;

// 实现UserService接口
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(String username) {
        System.out.println("Adding user: " + username);
        // 这里模拟添加用户的业务逻辑
    }
}
