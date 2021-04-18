package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.CacheManager;
import org.zhouhy.spring.bean.Employee;
import org.zhouhy.spring.bean.Manager;
import org.zhouhy.spring.bean.User;

public class IOCTest3 {
    
    @Test
    public void parentTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Manager manager = applicationContext.getBean("manager",Manager.class);
        System.out.println(manager.getDepartment());
        
        User user1 = applicationContext.getBean("user1",User.class);
        System.out.println(user1.toString());

//        Employee employee = applicationContext.getBean("employee",Employee.class);
//        System.out.println(employee == null);
    }

    @Test
    public void dependsOnTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        CacheManager manager = applicationContext.getBean("cacheManager",CacheManager.class);
        System.out.println(manager);
    }
}
