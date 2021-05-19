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
 * 4. 利用@Import 可以将其他配置导入到一个主配置当中去, 例如将本例的MyConfiguration2 导入到 MyConfiguration1
 * 还可以利用@Import将一个普通JavaBean 注入到容器当中去 例如@Import(UserBean2.class) 
 * 但是这种bean只能用这种方式去取, applicationContext.getBean(UserBean2.class);
 * 
 * 5. 实现ImportSelector的类可以有选择的把相应的bean加入到IOC容器当中去, 例如本例当中UserImportSelector 把 Teacher 和 Student
 * 加入了IOC容器中
 *  1) 定义需要加入IOC容器的类 Teacher Student
 *  2) 编写UserImportSelector 实现 ImportSelector接口
 *  3) 自定义一个注解EnableUserConfig 然后用 @Import 把UserImportSelector 引入
 *  4) 在一个类UserConfig 中加入上述注解, 然后调用的时候new AnnotationConfigApplicationContext(UserConfig.class)
 *  就可以将Teacher 和 Student 加入ioc 容器中了
 * 
 * 
 * 
 * 
 * 
 * */
public class MyConfigurationApp {
    public static void main(String[] args) {
        
    }
}
