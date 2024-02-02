package org.frank.spring.aop;

import org.frank.spring.aop.aspect.LoggingAspect;
import org.frank.spring.aop.config.AppConfig;
import org.frank.spring.aop.target.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopExampleApplication1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);        
        userService.addUser("John Doe");
    }
}
