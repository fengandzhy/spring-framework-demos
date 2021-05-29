package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.target.Calculator;

public class AOPTest {
    
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculator = context.getBean("calculator",Calculator.class);
        calculator.add(3,2);
        calculator.sub(3,4);
        calculator.div(6,2);
    }
}
