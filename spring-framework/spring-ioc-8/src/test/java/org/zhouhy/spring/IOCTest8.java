package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.beans.BeanB;

public class IOCTest8 {
    
    @Test
    public void test1(){
        ConfigurableApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names = applicationContext.getBeanDefinitionNames();        
//        for (String name : names) {
//            System.out.println(">>>>>>" + name);            
//        }

        BeanB b = applicationContext.getBean(BeanB.class);
        System.out.println(b.getBeanA());
        System.out.println(b.getBeanC());
    }
}
