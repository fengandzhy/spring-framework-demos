package org.zhouhy.spring;


/**
 * 1. 关于这个c3p0 的 DataSource 必须引入两个依赖, 一个是mysql的连接 mysql-connector-java, 另外一个就是c3p0本身, 请参考本例pom文件
 * 
 * 2. 关于这个context命名空间的引入 光引入 xmlns:context="http://www.springframework.org/schema/context" 还不行, 
 * 还要在 schemaLocation 中加入context相关的解析文件
 * http://www.springframework.org/schema/context 
 * http://www.springframework.org/schema/context/spring-context-4.2.xsd
 * 
 * 3. 关于引入外部properties文件, 请参考本例c3p0
 * 1) 先把文件找到<context:property-placeholder location="classpath:db.properties"/>
 * 2) 根据键值对的方式 找到对应的值 <property name="user" value="${db.username}"/>
 * 
 * 4. 一般来说init-method 和 destroy-method 是不能有参数的
 * 
 * 5. 假设现在有一个bean A, 它的生命周期包含了以下几步
 *  1) 调用 A 的构造器
 *  2) 调用 A 的setter方法, 给A注入属性
 *  3) 如果 A 实现了BeanNameAware 接口, 则调用setBeanName方法
 *  4) 如果 A 实现了BeanFactoryAware 接口, 则调用setBeanFactory 方法
 *  5) 如果 A 实现了ApplicationContextAware 接口, 则调用setApplicationContext 方法
 *  6) 如果有 B 实现了 BeanPostProcessor 接口, 则调用 B 的 postProcessBeforeInitialization
 *  7) 如果 A 设置了init-method 方法, 则调用该方法, 注意该方法不能有参数
 *  8) 如果有 B 实现了 BeanPostProcessor 接口, 则调用 B 的 postProcessAfterInitialization
 *  9) 使用bean, 本例中的 System.out.println(bean.getName());
 *  10) 当容器销毁时, 调用destroy-method, 这个方法也是没有参数的
 * 
 * 6. 如果A 实现了 BeanPostProcessor, 它会在所有未实现该接口的bean被创建之前就被创建出来, 
 * 而且它被创建的时候不会调用自己的 postProcessBeforeInitialization 和 postProcessAfterInitialization
 * 
 * 7. 容器会先创建实现了 BeanPostProcessor 接口的bean, 然后再去创建未实现该接口的bean
 * 
 * 8. 如果容器中A和B同时实现了 BeanPostProcessor, 那么创建的先后顺序是, 在xml文件中哪个定义在前就先创建哪个.
 * 而且后来创建的bean(没有实现BeanPostProcessor 接口), 在它们创建时会调用最先创建的那个bean(实现了BeanPostProcessor 接口)的 
 * postProcessBeforeInitialization 和 postProcessAfterInitialization 
 * 
 * */
public class App {
    public static void main(String[] args) {
        
    }
}
