package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.Animal;
import org.zhouhy.spring.bean.LifeCycleBean;
import org.zhouhy.spring.bean.Monkey;
import org.zhouhy.spring.bean.Tiger;

public class IOCTest6 {

    @Autowired
    @Qualifier("monkey")
    private Animal monkey;
    
    @Test
    public void getBeanTest(){
        ConfigurableApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal tiger = applicationContext.getBean("tig",Tiger.class);
        System.out.println(tiger.getName());
        
        Animal monkey = applicationContext.getBean("monkey",Monkey.class);
        System.out.println(monkey.getName());
        applicationContext.close();
    }

    @Test
    public void InitSequenceBeanTest(){
        ConfigurableApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) applicationContext.getBean("lifeCycleBean"); 
        System.out.println(lifeCycleBean.getBean());
        applicationContext.close();
    }

    @Test
    public void AutowireTest(){
        
        
    }
}
