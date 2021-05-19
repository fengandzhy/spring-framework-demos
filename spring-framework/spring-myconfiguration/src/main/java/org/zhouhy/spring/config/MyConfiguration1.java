package org.zhouhy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.zhouhy.spring.entity.UserBean;

@Configuration
@Import(MyConfiguration2.class)
public class MyConfiguration1 {
    
    public MyConfiguration1(){
        System.out.println("MyConfiguration1 is initializing...");
    }

    @Bean
    public UserBean userBean(){
        UserBean userBean= new UserBean();
        userBean.setUsername("agan");
        userBean.setPassword("123456");
        return userBean;
    }
    
}
