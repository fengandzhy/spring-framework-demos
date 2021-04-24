package org.zhouhy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouhy.spring.bean.Animal;
import org.zhouhy.spring.bean.LifeCycleBean;
import org.zhouhy.spring.bean.Monkey;
import org.zhouhy.spring.bean.Tiger;

import javax.annotation.Resource;
import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class IOCTest6 {

    @Autowired
    @Qualifier("monkey")
    private Animal monkey;

    @Autowired
    @Qualifier("tig")
    private Animal tiger;
    
    @Resource(name="bear")
    private Animal bear;


    @Inject
    @Qualifier("dog")
    private Animal dog;
    
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
        System.out.println(monkey.getName());
        System.out.println(tiger.getName());
        System.out.println(bear.getName());
        System.out.println(dog.getName());
    }
}
