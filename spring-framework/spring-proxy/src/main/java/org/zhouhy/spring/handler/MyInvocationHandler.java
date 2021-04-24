package org.zhouhy.spring.handler;

import org.zhouhy.spring.transaction.MyTransaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    
    private Object target;    
    private MyTransaction transaction;
    
    public MyInvocationHandler(Object target,MyTransaction transaction){
        this.target = target;
        this.transaction = transaction;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.transaction.before();
        method.invoke(this.target,args);
        this.transaction.after();
        return null;
    }
}
