package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.aware.LoginAction;
import org.zhouhy.spring.bean.Employee;
import org.zhouhy.spring.bean.Person;
import org.zhouhy.spring.bean.User;

public class IOCTest2 {
    
    @Test
    public void eventTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginAction loginAction = applicationContext.getBean("loginAction",LoginAction.class);
        loginAction.login("Erica","mypass");        
    }

    @Test
    public void autoWiredTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user);

        Person person = applicationContext.getBean("person",Person.class);
        System.out.println(person);

        Employee employee = applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);
    }
    
    
}
