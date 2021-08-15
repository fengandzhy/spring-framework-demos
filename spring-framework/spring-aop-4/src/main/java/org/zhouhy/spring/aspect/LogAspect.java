package org.zhouhy.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @After("execution(* org.zhouhy.spring.targets.*.*(..))")
    public void log(){
        System.out.println("记录日志!");
    }
}
