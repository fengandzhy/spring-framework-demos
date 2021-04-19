package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.factorybean.ConnectionFactoryBean;
import org.zhouhy.spring.staticfactory.StaticConnectionFactory;

import java.sql.Connection;

public class IOCTest5 {

    private ApplicationContext applicationContext
            = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    @Test
    public void factoryBeanTest(){
        Connection connection = applicationContext.getBean("connection",Connection.class);
        System.out.println(connection);

        ConnectionFactoryBean connectionFactoryBean 
                = applicationContext.getBean("&connection",ConnectionFactoryBean.class);
        System.out.println(connectionFactoryBean);
        
    }

    @Test
    public void factoryTest(){
        Connection connection = applicationContext.getBean("conn",Connection.class);
        System.out.println(connection);
    }

    @Test
    public void staticFactoryTest(){
        Connection connection = applicationContext.getBean("dbconn",Connection.class);
        System.out.println(connection);

        Connection connection1 = applicationContext.getBean("dbconn1",Connection.class);
        System.out.println(connection1);
    }
}
