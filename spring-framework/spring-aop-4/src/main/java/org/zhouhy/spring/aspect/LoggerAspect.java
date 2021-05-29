package org.zhouhy.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class LoggerAspect {
    Logger logger = LoggerFactory.getLogger(this.getClass());


    
    public void beforeAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("BeforeAdvice, running before the method "+method +" and args is "+list);
    }

    
    public void afterAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("AfterAdvice running after the method "+method +" and args is "+list);
    }

    
    public void returnAdvice(JoinPoint joinPoint,Object result){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("AfterReturningAdvice running when the method give out the return result the method is  "+method +" and args is "+list+" and the result is "+result);
    }

    
    public void throwingAdvice(JoinPoint joinPoint,Exception ex){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info(method +" 执行时抛出异常,记录日志. 方法参数:"+list+",发生异常: "+ex.getMessage());
    }
    
}
