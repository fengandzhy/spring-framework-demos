package org.zhouhy.spring.dao;

import org.zhouhy.spring.entity.User;

public interface UserDao {

    void save(User user);
    
    int buy();
    
}
