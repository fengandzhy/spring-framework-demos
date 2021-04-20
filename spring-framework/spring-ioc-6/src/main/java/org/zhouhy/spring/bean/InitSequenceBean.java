package org.zhouhy.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;



public class InitSequenceBean implements InitializingBean {
    
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In the afterPropertiesSet from InitializingBean!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("InitSequenceBean: postConstruct");
    }

    public void init() {
        System.out.println("InitSequenceBean: initMethod");
    }
    
}
