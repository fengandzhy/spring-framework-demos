package org.zhouhy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zhouhy.spring.beans.BeanA;

@Configuration
public class BeanAConfig {
    
    @Bean
    public BeanA beanA(){
        return new BeanA();
    }
}
