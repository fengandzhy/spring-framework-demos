package org.zhouhy.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.zhouhy.spring.entity.UserBean2;


@Configuration
@Import({UserBean2.class})
public class MyConfiguration2 {
    
    public MyConfiguration2(){
        System.out.println("MyConfiguration2 is initializing ...");
    }
}
