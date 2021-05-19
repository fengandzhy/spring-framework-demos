package org.zhouhy.spring;

/**
 * 1. 从Spring3.0，@Configuration用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法， 
 * 这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描， 
 * 并用于构建bean定义，初始化Spring容器
 * 
 * 2. 注意AnnotationConfigApplicationContext 是通过加入MyConfiguration1.class的方式来区分不同的configuration
 * ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration1.class);
 * 
 * 3. 如果@Bean没有写成@Bean(name="xxxx")的话, 默认的bean的id 就是标注的方法名. 如果标注的方法名是UserBean 
 * 那么你applicationContext.getBean("userBean",UserBean.class); 就无法拿到
 * 
 * 
 * 
 * */
public class MyConfigurationApp {
    public static void main(String[] args) {
        
    }
}
