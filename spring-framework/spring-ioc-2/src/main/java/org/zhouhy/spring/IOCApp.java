package org.zhouhy.spring;


/**
 * 1. 关于这个ApplicationContext 实现事件传播, 必须有以下几个因素
 *  1) 事件源 继承了 ApplicationEvent 的类
 *  2) 监听者 继承了 ApplicationListener 的类
 *  3) 传播者 继承了 ApplicationContextAware 的类, 在这个类当中的ApplicationContext 是spring自动注入的
 *  4) 在spring 容器里只需要注册传播者和监听者, 不需要注册事件源.
 *  
 * 2. 关于spring 的自动装配请参看本例的几个例子, spring 一共有三种方式自动装配 byName, byType, constructor
 * 
 * 3. @Autowired @Inject 和 @Resource 的区别
 *  1) @Autowired是Spring自带的，@Inject和@Resource都是JDK提供的，其中@Inject是JSR330规范的实现，@Resource是JSR250规范的实现。
 *  2) @Autowired和@Inject基本是一样的，因为两者都是使AutowiredAnnotationBeanPostProcessor来处理依赖注入。但是@Resource不一样，它使用的是CommonAnnotationBeanPostProcessor来处理依赖注入。当然，两者都是BeanPostProcessor。
 *  3) @Autowired和@Inject主要区别是@Autowired可以设置required属性为false，而@Inject并没有这个设置选项。
 *  4) @Resource默认是按照byName进行注入，而@Autowired和@Inject默认是按照byType进行注入。
 *  5) @Autowired通过@Qualifier指定注入特定bean,@Resource可以通过参数name指定注入bean,@Inject需要@Named注解指定注入bean。
 *  
 *  
 *  
 * 
 * 
 * */
public class IOCApp {
    public static void main(String[] args) {
        
    }
}
