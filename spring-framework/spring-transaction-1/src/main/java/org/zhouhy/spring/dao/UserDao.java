package org.zhouhy.spring.dao;

import org.zhouhy.spring.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    
    List<User> searchByUsername(String username);
    
    int updateBalance(User user);
    
}
