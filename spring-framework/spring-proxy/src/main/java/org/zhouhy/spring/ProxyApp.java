package org.zhouhy.spring;

/**
 * 1. JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理
 * 
 * 2. cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 * 
 * 3. JDK动态代理是实现 InvocationHandler接口, 使用invoke()方法进行面向切面的处理 
 * 
 * 4. cglib动态代理是实现MethodInterceptor接口, 使用intercept()方法进行面向切面的处理 
 * 
 * 
 * */
public class ProxyApp {
    public static void main(String[] args) {
        
    }
}
