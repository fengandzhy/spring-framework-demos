package org.zhouhy.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            System.out.println("postProcessBeforeInitialization....拦截指定bean "+beanName);
        }
        //System.out.println("这句话证明所有容器中的bean都会被postProcessBeforeInitialization拦截.. beanName=" + beanName + "==>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeCycleBean) {
            System.out.println("postProcessAfterInitialization....拦截指定bean " +beanName);
        }
        //System.out.println("这句话证明所有容器中的bean都会被postProcessAfterInitialization拦截.. beanName=" + beanName + "==>" + bean);
        return bean;
    }
}
