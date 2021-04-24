package org.zhouhy.spring.proxy;

import org.zhouhy.spring.entity.User;
import org.zhouhy.spring.service.UserService;
import org.zhouhy.spring.transaction.MyTransaction;

public class ProxyService implements UserService {
    
    private UserService userService;
    private MyTransaction transaction;
    
    public ProxyService(UserService userService,MyTransaction transaction){
        this.transaction = transaction;
        this.userService = userService;
    }
    
    @Override
    public void add(User user) {
        transaction.before();
        userService.add(user);
        transaction.after();
    }

    @Override
    public void del(int uid) {
        transaction.before();
        userService.del(uid);
        transaction.after();
    }
}
