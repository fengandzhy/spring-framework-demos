package org.zhouhy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zhouhy.spring.entity.UserBean;

/**
 * @Configuration 说明此类是配置类
 *
 * @Configuration 用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，
 * 这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
 * 并用于构建bean定义，初始化Spring容器。
 * */
@Configuration
public class MyConfiguration {
    public MyConfiguration(){
        System.out.println("MyConfiguration容器启动初始化。。。");
    }


    /**
     * @Bean 注解在返回实例的方法上，如果未通过@Bean指定bean的名称，则默认的Bean对象名与标注的方法名相同；
     * 以下创建的对象名，和方法名一样，即userBean
     */
    @Bean
    public UserBean userBean(){
        UserBean userBean = new UserBean();
        userBean.setUsername("ABC");
        userBean.setPassword("123");
        return userBean;
    }
}
