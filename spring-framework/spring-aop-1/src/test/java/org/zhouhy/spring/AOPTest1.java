package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.target.Calculator;

public class AOPTest1 {
    
    @Test
    public void CalculatorTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculator = applicationContext.getBean("calculator",Calculator.class);
        calculator.add(1,3);
        calculator.sub(2,1);
    }
}
