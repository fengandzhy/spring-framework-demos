package org.zhouhy.spring;


/**
 * 1. 关于bean的周期, 请参考本例的LifeCycleBean 的例子
 *      LifeCycleBean:constructor
 *      LifeCycleBean: setBeanName
 *      LifeCycleBean: setBeanName from BeanNameAware
 *      LifeCycleBean: setBeanFactory from BeanFactoryAware
 *      LifeCycleBean: setApplicationContext from ApplicationContextAware
 *      postProcessBeforeInitialization....拦截指定bean lifeCycleBean
 *      LifeCycleBean: postConstruct from @PostConstruct
 *      LifeCycleBean: afterPropertiesSet from InitializingBean!
 *      LifeCycleBean: initMethod
 *      postProcessAfterInitialization....拦截指定bean lifeCycleBean
 *      LifeCycleBean
 *      LifeCycleBean: PreDestroy from @PreDestroy
 *      LifeCycleBean: destroy from DisposableBean
 *      LifeCycleBean: destroyMethod
 *    
 * 2. 如果这个值@Value("tiger")设置到了set方法上, 那么spring 会调用set方法来为属性赋值, 如果它设置到了属性上, 则就代表spring会通过反射来为属性赋值
 * 
 * 
 * 
 * 
 * */
public class App6 {
    public static void main(String[] args) {
        
    }
}
