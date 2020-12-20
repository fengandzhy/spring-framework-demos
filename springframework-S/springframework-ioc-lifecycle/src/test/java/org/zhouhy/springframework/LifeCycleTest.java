package org.zhouhy.springframework;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.springframework.entity.Person;

public class LifeCycleTest {

    
    @Test
    public void test1(){
        System.out.println("现在开始初始化容器");
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        System.out.println("容器初始化成功");

        Person person = context.getBean("person",Person.class);

        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }
}
