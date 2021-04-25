package org.zhouhy.spring;

import org.junit.Test;
import org.zhouhy.spring.entity.User;
import org.zhouhy.spring.handler.MyInvocationHandler;
import org.zhouhy.spring.interceptor.CglibProxy;
import org.zhouhy.spring.proxy.ProxyService;
import org.zhouhy.spring.service.UserService;
import org.zhouhy.spring.service.impl.UserServiceImpl;
import org.zhouhy.spring.transaction.MyTransaction;

import java.lang.reflect.Proxy;

public class ProxyTest {
    
    @Test
    public void staticProxyTest(){
        MyTransaction transaction = new MyTransaction();
        UserService userService = new UserServiceImpl();
        ProxyService service = new ProxyService(userService,transaction);
        
        service.add(new User());
        service.del(1);
        
    }

    @Test
    public void dynamicProxyTest(){
        MyTransaction transaction = new MyTransaction();
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService,transaction);

        UserService service = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader()
                ,userService.getClass().getInterfaces(),invocationHandler);
        service.add(null);
        service.del(1);

    }


    @Test
    public void cglibProxyTest(){
        MyTransaction transaction = new MyTransaction();
        CglibProxy proxy = new CglibProxy(transaction);
        UserServiceImpl userService = (UserServiceImpl) proxy.getProxy(UserServiceImpl.class);
        userService.add(null);
        userService.del(2);
    }
}
