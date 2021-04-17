package org.zhouhy.springframework.aop.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    
    private Object target;
    
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            
        Object ret = null;
        if(method.getName().equals("sayHello")){
            System.out.println("------插入前置通知代码-------------");
            ret = method.invoke(target,args);
        }        
        return ret;
    }
}
