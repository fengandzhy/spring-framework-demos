package org.zhouhy.springframework.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
    
    private ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
    
    @Test
    public void test1(){
        
        Person person = (Person) context.getBean("person");
        System.out.println("person = "+person);
    }

    @Test
    public void test2(){
        
        //通过这种⽅式获得对象，就不需要强制类型转换
        Person person = context.getBean("person", Person.class);
        System.out.println("person = "+person);
    }


    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");

        //当前Spring的配置⽂件中 只能有⼀个<bean class是Person类型
        Person person = context.getBean(Person.class);
        System.out.println("person = "+person);
    }

    @Test
    public void test4(){
        
        //获取的是 Spring⼯⼚配置⽂件中所有bean标签的id值 person person1
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " +
                    beanDefinitionName);
        }
    }


    @Test
    public void test5(){
        
        //根据类型获得Spring配置⽂件中对应的id值
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String id : beanNamesForType) {
            System.out.println("id = " + id);
        }
    }

    @Test
    public void test6(){
        
        //⽤于判断是否存在指定id值得bean, 它只能判断id不能判断name
        if (context.containsBeanDefinition("a")) {
            System.out.println("true = " + true);
        }else{
            System.out.println("false = " + false);
        }
    }

    @Test
    public void test7(){        

        //⽤于判断是否存在指定id值得bean,可以判断name
        if (context.containsBean("person")) {
            System.out.println("true = " + true);
        }else{
            System.out.println("false = " + false);
        }
    }
}
