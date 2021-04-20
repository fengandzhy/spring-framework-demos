package org.zhouhy.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean implements BeanNameAware,
        BeanFactoryAware,ApplicationContextAware,InitializingBean
        {
    private Integer Id;
    private String name;
    
    public LifeCycleBean(){
        System.out.println("In the constructor!");
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("In the setter!");
        this.name = name;
    }
    
    public void init(){
        System.out.println("In the init!");
        
    }
    
    public void destroy(){
        System.out.println("In the destroy!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("In the setBeanName from BeanNameAware!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In the setBeanFactory from BeanFactoryAware!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In the setApplicationContext from ApplicationContextAware!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In the afterPropertiesSet from InitializingBean!");
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("In the postProcessBeforeInitialization from BeanPostProcessor!"+beanName);
//        return null;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("In the postProcessAfterInitialization from BeanPostProcessor!"+beanName);
//        return null;
//    }
}
