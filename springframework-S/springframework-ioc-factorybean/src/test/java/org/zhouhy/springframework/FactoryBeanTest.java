package org.zhouhy.springframework;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class FactoryBeanTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
    
    @Test
    public void test1(){
        /**
         * 由于ConnectionFactoryBean实现了FactoryBean接口,所以这里(Connection) context.getBean("connection") 
         * 返回的不是ConnectionFactoryBean 对象而是 Connection 对象 
         * */
        Connection connection = (Connection) context.getBean("connection");
        System.out.println(connection);
    }

    @Test
    public void test2(){
        Connection connection = (Connection) context.getBean("conn");
        System.out.println(connection);
    }

    @Test
    public void test3(){
        Connection connection = (Connection) context.getBean("conn1");
        System.out.println(connection);
    }
}
