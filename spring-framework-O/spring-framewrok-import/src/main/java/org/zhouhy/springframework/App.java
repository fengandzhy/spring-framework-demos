package org.zhouhy.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.zhouhy.springframework.component.UserService;
import org.zhouhy.springframework.entity.UserBean;

/**
 * 如果这要加入@ComponentScan 那么new AnnotationConfigApplicationContext(App.class);
 * 如果不加入@ComponentScan 那么就要写成 new AnnotationConfigApplicationContext(UserService.class);
 * 也就是说就要写成@Component所在的那个类
 * */
@ComponentScan("org.zhouhy.springframework.*")
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        UserService userService = (UserService) context.getBean("userService");
        UserBean userBean = context.getBean(UserBean.class);
        System.out.println(userBean.toString());
        System.out.println(userService.toString());
    }
}
