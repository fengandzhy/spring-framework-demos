package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.bean.Animal;
import org.zhouhy.spring.bean.InitSequenceBean;
import org.zhouhy.spring.bean.Monkey;
import org.zhouhy.spring.bean.Tiger;

public class IOCTest6 {

    private ApplicationContext applicationContext
            = new ClassPathXmlApplicationContext("applicationContext.xml");
    
    
    
    @Test
    public void getBeanTest(){
        Animal tiger = applicationContext.getBean("tig",Tiger.class);
        System.out.println(tiger.getName());
        
        Animal monkey = applicationContext.getBean("monkey",Monkey.class);
        System.out.println(monkey.getName());
    }

    @Test
    public void InitSequenceBeanTest(){
        InitSequenceBean initSequenceBean = (InitSequenceBean) applicationContext.getBean("initSequenceBean"); 
    }
}
