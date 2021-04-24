package org.zhouhy.spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.zhouhy.spring.bean.LifeCycleBean;

@Configuration
public class SystemConfig {

    @Lazy
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)//singleton
    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }
}
