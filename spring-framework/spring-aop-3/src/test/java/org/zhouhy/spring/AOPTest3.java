package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.target.Calculator;

public class AOPTest3 {

    @Test
    public void CalculatorTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculator calculator = applicationContext.getBean("calculator",Calculator.class);
        calculator.add(2,2);
        calculator.sub(3,4);
        calculator.div(6,2);        
    }
}
