package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zhouhy.spring.config.MyConfiguration1;
import org.zhouhy.spring.entity.UserBean;

public class ConfigurationTest {
    
    @Test
    public void configurationTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration1.class);
        UserBean userBean = applicationContext.getBean("userBean",UserBean.class);
        System.out.println(userBean.toString());
    }
}
