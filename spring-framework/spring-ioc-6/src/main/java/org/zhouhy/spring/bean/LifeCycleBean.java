package org.zhouhy.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LifeCycleBean 
        implements InitializingBean,DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {

    private String bean;
    
    public LifeCycleBean(){
        System.out.println("LifeCycleBean:constructor");
    }

    @Value("LifeCycleBean")
    public void setBean(String bean) {
        System.out.println("LifeCycleBean: setBeanName");
        this.bean = bean;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("LifeCycleBean: setBeanName from BeanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycleBean: setBeanFactory from BeanFactoryAware");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycleBean: setApplicationContext from ApplicationContextAware");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("LifeCycleBean: postConstruct from @PostConstruct");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBean: afterPropertiesSet from InitializingBean!");
    }    

    public void initMethod() {
        System.out.println("LifeCycleBean: initMethod");
    }

    public String getBean() {
        return bean;
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("LifeCycleBean: PreDestroy from @PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleBean: destroy from DisposableBean");
    }
    
    public void destroyMethod(){
        System.out.println("LifeCycleBean: destroyMethod");
    }
}
