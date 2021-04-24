package org.zhouhy.spring;


/**
 *  1. 如果纯粹用annotation 来代替xml文件注意这里两点
 *      1) 在一个类中加入 @Configuration 和 @ComponentScan, 参考本例的ResourceConfig
 *      2) 用这个来获得ApplicationContext,AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
 *          
 *  2. 如果要在test里面注入Autowired 请参考本例 IOCTest7, 里面@RunWith和@ContextConfiguration的用法
 *  
 *  
 * */
public class App7 {
    public static void main(String[] args) {
        
    }
}
