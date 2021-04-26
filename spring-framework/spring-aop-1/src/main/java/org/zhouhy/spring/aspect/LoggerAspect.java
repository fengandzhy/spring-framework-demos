package org.zhouhy.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class LoggerAspect {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 第一个*代表所有类型所有返回值的方法
     * 第二个*代表包名下所有的类
     * 第三个星号代表所有的方法
     * 
     * */
    @Pointcut("execution(* org.zhouhy.spring.target.*.*(..))")
    public void pointcut() {
    }
    
    
    //@Before("execution(public int org.zhouhy.spring.target.impl.CalculatorImpl.*(int,int))")
    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("BeforeAdvice, running before the method "+method +" and args is "+list);
    }

    @After("pointcut()")
    public void afterAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("AfterAdvice running after the method "+method +" and args is "+list);
    }

    @AfterReturning(value = "pointcut()",returning = "result")
    public void returnAdvice(JoinPoint joinPoint,Object result){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info("AfterReturningAdvice running when the method give out the return result the method is  "+method +" and args is "+list+" and the result is "+result);
    }

    @AfterThrowing(value = "pointcut()",throwing = "ex")
    public void throwingAdvice(JoinPoint joinPoint,Exception ex){
        String method = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        logger.info(method +" 执行时抛出异常,记录日志. 方法参数:"+list+",发生异常: "+ex.getMessage());
    }
    
}
