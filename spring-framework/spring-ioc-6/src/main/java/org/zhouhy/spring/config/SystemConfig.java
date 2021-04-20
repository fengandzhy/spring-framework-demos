package org.zhouhy.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zhouhy.spring.bean.InitSequenceBean;

@Configuration
public class SystemConfig {

    @Bean(initMethod = "init", name = "initSequenceBean")
    public InitSequenceBean initSequenceBean() {
        return new InitSequenceBean();
    }
}
