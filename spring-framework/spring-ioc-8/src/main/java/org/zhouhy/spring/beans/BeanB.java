package org.zhouhy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    
    @Autowired
    private BeanA beanA;
    
    @Autowired
    private BeanC beanC;

    public BeanA getBeanA() {
        return beanA;
    }

    public BeanC getBeanC() {
        return beanC;
    }
}
