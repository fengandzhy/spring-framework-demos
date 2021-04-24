package org.zhouhy.spring.interceptor;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.zhouhy.spring.transaction.MyTransaction;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    
    private Enhancer enhancer = new Enhancer();
    
    private MyTransaction myTransaction;
    
    public CglibProxy(MyTransaction myTransaction){
        this.myTransaction = myTransaction;
    }
    
    public Object getProxy(Class clz){
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        myTransaction.before();
        Object invoke = methodProxy.invokeSuper(o,objects);
        myTransaction.after();
        return invoke;
    }
}
