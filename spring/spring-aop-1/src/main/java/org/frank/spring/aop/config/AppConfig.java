package org.frank.spring.aop.config;

import org.frank.spring.aop.target.UserService;
import org.frank.spring.aop.target.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
