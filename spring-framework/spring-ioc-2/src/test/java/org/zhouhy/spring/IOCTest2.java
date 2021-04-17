package org.zhouhy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zhouhy.spring.aware.LoginAction;

public class IOCTest2 {
    
    @Test
    public void eventTest(){
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginAction loginAction = applicationContext.getBean("loginAction",LoginAction.class);
        loginAction.login("Erica","mypass");        
    }
}
