package org.frank.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 使用@Aspect注解标注这是一个切面
@Aspect
//@Component
public class LoggingAspect {
    
    // 定义一个切点，匹配UserService中的所有方法
    @Pointcut("execution(* org.frank.spring.aop.target.impl.UserServiceImpl.*(..))")    
    public void userServiceMethods() {}

    // 在方法执行之前的通知
    @Before("userServiceMethods()")
    public void beforeAddingUser(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    // 在方法执行之后的通知
    @After("userServiceMethods()")
    public void afterAddingUser(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }
}
