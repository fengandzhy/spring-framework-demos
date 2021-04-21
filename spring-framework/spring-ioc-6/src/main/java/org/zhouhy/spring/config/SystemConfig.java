package org.zhouhy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zhouhy.spring.bean.LifeCycleBean;

@Configuration
public class SystemConfig {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }
}
