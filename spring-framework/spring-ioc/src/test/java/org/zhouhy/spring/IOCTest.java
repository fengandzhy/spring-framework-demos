package org.zhouhy.spring;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.Address;
import org.zhouhy.spring.bean.User;

@Slf4j
public class IOCTest {
    
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
    
}
