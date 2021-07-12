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
 * 3. @Inject 这个注解要加入另外一个 maven 依赖 javax.inject 
 * 
 * 4. 要在Junit中测试@Autowired @Resource @Inject 在junit class 之前必须加入, 具体请参考本例的test 
 *      @RunWith(SpringJUnit4ClassRunner.class)
 *      @ContextConfiguration("classpath:applicationContext.xml")
 *      
 * 5. spring-test 需要依赖 4.12 以上的junit  
 * 
 * 6. @Bean 注解必须要结合 @Configuration 注解使用, @Lazy 表示延迟加载, @Scope 表示bean的作用域
 * 
 * 
 * */
public class IOCApp6 {
    public static void main(String[] args) {
        
    }
}
