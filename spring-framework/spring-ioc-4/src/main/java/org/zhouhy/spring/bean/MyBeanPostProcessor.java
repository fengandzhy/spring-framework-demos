package org.zhouhy.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In the postProcessBeforeInitialization beanName is "+beanName);
//        if(beanName.equals("lifeCycle")){
//            LifeCycleBean lifeCycleBean = (LifeCycleBean) bean;
//            lifeCycleBean.setName(lifeCycleBean.getName()+"CBD");
//            return lifeCycleBean;
//        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In the postProcessAfterInitialization beanName is "+beanName);
//        if(beanName.equals("lifeCycle")){
//            LifeCycleBean lifeCycleBean = (LifeCycleBean) bean;
//            lifeCycleBean.setName(lifeCycleBean.getName()+"ABC");
//            return lifeCycleBean;
//        }
        return null;
    }
    
    public void init(){
        System.out.println("In the MyBeanPostProcessor's init!");
    }
}
