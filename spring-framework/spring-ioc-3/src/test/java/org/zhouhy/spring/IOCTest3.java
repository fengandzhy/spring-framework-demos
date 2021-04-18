package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.*;

public class IOCTest3 {
    
    @Test
    public void parentTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Manager manager = applicationContext.getBean("manager",Manager.class);
        System.out.println(manager.getDepartment());
        
        User user1 = applicationContext.getBean("user1",User.class);
        System.out.println(user1.toString());
    }

    @Test
    public void dependsOnTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        CacheManager manager = applicationContext.getBean("cacheManager",CacheManager.class);
        System.out.println(manager);
    }

    @Test
    public void scopeTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car1 = applicationContext.getBean("car",Car.class);
        Car car2 = applicationContext.getBean("car",Car.class);
        System.out.println(car1);
        System.out.println(car2);
    }
}
