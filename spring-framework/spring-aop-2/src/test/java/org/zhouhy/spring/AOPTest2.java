package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.target.Employee;

public class AOPTest2 {
    
    @Test
    public void developerHelperTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee developer = context.getBean("developer",Employee.class);
        developer.work();
    }

    @Test
    public void managerHelperTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee manager = context.getBean("manager",Employee.class);
        manager.work();
    }
}
