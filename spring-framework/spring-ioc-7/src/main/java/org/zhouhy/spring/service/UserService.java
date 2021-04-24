package org.zhouhy.spring.service;

import org.springframework.stereotype.Service;
import org.zhouhy.spring.entity.User;

@Service
public class UserService extends BaseService<User>{

    @Override
    public void add() {
        super.add();
        User user = new User();
        user.setId(1);
        user.setUsername("user");
        user.setPassword("123456");
        this.getBaseDao().add(user);
    }
}
