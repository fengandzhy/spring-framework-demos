package org.zhouhy.spring;


/**
 * 1. 在spring的配置文件中&要被&amp;来代替
 * 
 * 2. 设置DB url 的时候一定要设置serverTimezone 这个选项
 * 
 * 3. 实现了FactoryBean这个接口的类必然会实现以下两个方法
 *  1) getObject 这个是创建bean的逻辑和方法
 *  2) getObjectType 这个是被创建bean的类型
 *  
 * 4. 在FactoryBean这个接口中, 有一个方法是isSingleton, 如果这个返回为true, 那么意味着每次都会创建新的对象
 * 
 * 5. 由于ConnectionFactoryBean实现了FactoryBean接口, 所以application.getBean("connection")所返回的是ConnectionFactoryBean
 * 里面的getObject所创建的方法
 * 
 * 6. application.getBean("&connection") 才是返回的真实的ConnectionFactoryBean 方法
 * 
 * 7. 用实例工厂配置Connection 必须完成两个配置, factory-bean 和 factory-method 其中factory-bean 是实例工厂, 
 * factory-method 是该工厂负责创建bean的方法. 
 * 
 * 8. 静态工厂的方法必须是静态的, 如果一个bean只配置factory-method而没有配置factory-bean 那么它本身就是一个静态工厂,
 * 那么ctx=application.getBean("dbconn"); 得到的就是factory-method创建的对象. 
 * 
 * 9. 静态工厂里面的静态方法可以通过<constructor-arg type="java.lang.String" value="com.mysql.jdbc.Driver"/>的方式传递参数
 * 
 * 10. 实例工厂也可以用上述方法来传递参数, 但是FactoryBean的实现类当中getObject方法却无法传参.
 * 
 * 11. spring 创建对象要么通过调用它的有参构造器(constructor注入), 要么通过调用它的无参构造器(setter注入), 但是有一种bean创建的时候会伴有逻辑
 * 例如Connection, 这个时候就很难通过上述两种方法来创建bean, 那么spring 提供了三种创建这种bean的方法.
 *  1) FactoryBean
 *  2) 实例工厂
 *  3) 静态工厂
 * 
 * 
 * 
 * */
public class App5 {
    public static void main(String[] args) {
        
    }
}
