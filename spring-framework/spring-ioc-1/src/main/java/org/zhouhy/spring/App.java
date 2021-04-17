package org.zhouhy.spring;


/**
 * 1. IoC(Inversion of Control) 指将传统上由程序代码直接操控的对象调用权交给容器，通过容器来实现对象的装配和管理。
 * 控制反转就是对对象控制权的转移，从程序代码本身反转到了外部容器
 * 
 * 2. 依赖注入 DI 是指程序运行过程中，若需要调用另一个对象协助时，无须在代码中创建被调用者，而是依赖于外部容器，由外部容器创建后传递给程序
 * 
 * 3. 关于spring 的循环依赖记住两点
 *  1) Spring是通过递归的方式获取目标bean及其所依赖的bean的
 *  2) Spring实例化一个bean的时候，是分两步进行的，首先实例化目标bean，然后为其注入属性
 * 
 * 4. 关于构造器注入, 通过构造方法注入依赖. 具体的实例请参看本例的 user1, user2, user3  的注入
 * 
 * 5. 关于setter注入, 是通过set方法注入依赖, 具体的请参看本例的 address1, address2, address3 的注入
 * 
 * 6. 关于自定义转换器的方法, 请参看本例当中的 stu1 stu2 的定义方法, 它自己编写了一个类型转换器myDateConverter 来负责将yyyy-MM-dd转成Date类型
 * 
 * 7. 关于这个集合配置, 请参考本例的account 配置方法
 * 
 * 8. 
 * 
 * 
 * */
public class App {
    public static void main(String[] args) {
        
    }
}
