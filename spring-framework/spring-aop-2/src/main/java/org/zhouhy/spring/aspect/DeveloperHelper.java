package org.zhouhy.spring.aspect;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DeveloperHelper implements MethodBeforeAdvice,AfterReturningAdvice {
    
    
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("Before the developer's work!");
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("After the developer's work!");
    }
}
