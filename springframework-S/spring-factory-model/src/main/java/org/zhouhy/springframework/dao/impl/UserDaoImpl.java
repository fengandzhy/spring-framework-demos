package org.zhouhy.springframework.dao.impl;

import org.zhouhy.springframework.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("Save user to DB.");
    }
}
