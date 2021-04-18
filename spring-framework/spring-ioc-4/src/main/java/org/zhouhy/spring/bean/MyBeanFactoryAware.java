package org.zhouhy.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyBeanFactoryAware implements BeanFactoryAware {
    
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In the MyBeanFactoryAware ");
    }

    public void init(){
        System.out.println("In the MyBeanFactoryAware's init!");
    }
}
