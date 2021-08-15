package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.targets.SayHelloService;



public class AOPTest4 {
    
    @Test
    public void test(){
        
        
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        SayHelloService sayHelloService = applicationContext.getBean(SayHelloService.class);
        sayHelloService.say();
    }
}
