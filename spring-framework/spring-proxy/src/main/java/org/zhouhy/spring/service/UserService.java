package org.zhouhy.spring.service;

import org.zhouhy.spring.entity.User;

public interface UserService {
    
    public void add(User user);
    
    public void del(int uid);
}
