package org.zhouhy.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class LoggerAspect {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    @Before("execution(public int org.zhouhy.spring.target.impl.CalculatorImpl.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("Before the method "+method +" and args is "+list);
    }
    
}
