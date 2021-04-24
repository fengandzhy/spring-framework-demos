package org.zhouhy.spring.service.impl;

import org.zhouhy.spring.entity.User;
import org.zhouhy.spring.service.UserService;

public class UserServiceImpl implements UserService {
    
    @Override
    public void add(User user) {
        System.out.println("增加 User");
    }

    @Override
    public void del(int uid) {
        System.out.println("删除 User");
    }
}
