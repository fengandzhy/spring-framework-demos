package org.zhouhy.springframework.proxy;

import org.junit.Test;
import org.zhouhy.springframework.aop.proxy.handler.MyInvocationHandler;
import org.zhouhy.springframework.aop.proxy.target.IHello;
import org.zhouhy.springframework.aop.proxy.target.impl.HelloImpl;

import java.lang.reflect.Proxy;

public class ProxyTest {
    
    @Test
    public void test1(){
        IHello hello = null;
        try {
            hello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),
                    new Class[]{IHello.class},
                    new MyInvocationHandler(new HelloImpl()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        hello.sayHello();
        
        hello.sayGoodBye();
    }
}
