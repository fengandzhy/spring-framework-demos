package org.zhouhy.spring;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.*;

//@Slf4j
public class IOCTest1 {
    
    @Test
    public void constructorTest(){
        ApplicationContext applicationContext 
                = new ClassPathXmlApplicationContext("application.xml");
        
        User user1= applicationContext.getBean("user1",User.class);
        System.out.println(user1.toString());

        User user2= applicationContext.getBean("user2",User.class);
        System.out.println(user2.toString());

        User user3= applicationContext.getBean("user3",User.class);
        System.out.println(user3.toString());      
        
    }

    @Test
    public void setterTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");

        Address address = applicationContext.getBean("address1",Address.class);
        System.out.println(address.toString());    

    }


    @Test
    public void converterTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");

        Student stu1 = applicationContext.getBean("stu1",Student.class);
        System.out.println(stu1.toString());

        Student stu2 = applicationContext.getBean("stu2",Student.class);
        System.out.println(stu2.toString());
    }

    @Test
    public void collectionTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");

        Account account = applicationContext.getBean("account",Account.class);
        
        System.out.println(account.getArray());
        System.out.println(account.getList());
        System.out.println(account.getSet());
        System.out.println(account.getMap());
        System.out.println(account.getUsers());
        System.out.println(account.getProperties());
        
    }


    @Test
    public void circleDependencyTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");

        CircleBeanA circleBeanA = applicationContext.getBean("circleBeanA1",CircleBeanA.class);
        CircleBeanB circleBeanB = applicationContext.getBean("circleBeanB1",CircleBeanB.class);
        
        System.out.println(circleBeanA.getCircleBeanB().getName());
        System.out.println(circleBeanB.getCircleBeanA().getName());
        
        //System.out.println(circleBeanA.toString());

//        CircleBeanA circleBeanA2 = applicationContext.getBean("circleBeanA2",CircleBeanA.class);
//        CircleBeanB circleBeanB2 = applicationContext.getBean("circleBeanB2",CircleBeanB.class);
    }

    @Test
    public void specialCharacterTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("application.xml");

        Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
        System.out.println(teacher.toString());
        
    }
    
}
