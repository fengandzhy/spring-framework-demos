package org.zhouhy.springframework.service.impl;

import org.zhouhy.springframework.service.UserService;

public class UserServiceImpl implements UserService {
    
    public void save() {
        System.out.println("Save user");
    }
}
