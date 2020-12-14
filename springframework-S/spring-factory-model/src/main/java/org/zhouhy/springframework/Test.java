package org.zhouhy.springframework;

import org.zhouhy.springframework.dao.UserDao;
import org.zhouhy.springframework.factory.BeanFactory;
import org.zhouhy.springframework.service.UserService;

public class Test {
    public static void main(String[] args) {
        UserService userService = (UserService) BeanFactory.getBean("userService");
        UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
        
        userService.save();
        userDao.save();
    }
}
