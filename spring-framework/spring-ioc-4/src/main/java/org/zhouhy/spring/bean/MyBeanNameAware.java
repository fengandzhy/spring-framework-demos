package org.zhouhy.spring.bean;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameAware implements BeanNameAware {
    
    @Override
    public void setBeanName(String name) {
        System.out.println("In the MyBeanNameAware,name is "+name);
    }

    public void init(){
        System.out.println("In the MyBeanNameAware's init!");
    }
}
