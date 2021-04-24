package org.zhouhy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouhy.spring.config.ResourceConfig;
import org.zhouhy.spring.service.BaseService;
import org.zhouhy.spring.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ResourceConfig.class)
public class IOCTest7 {
    
    @Autowired
    private BaseService baseService;
    
    @Test
    public void GenericTest(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ResourceConfig.class);

        BaseService service = context.getBean("userService",UserService.class);
        service.add();
    }

    @Test
    public void AutowiredTest(){
        baseService.add();
    }
}
