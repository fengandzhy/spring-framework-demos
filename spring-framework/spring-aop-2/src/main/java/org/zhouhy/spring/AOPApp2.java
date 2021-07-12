package org.zhouhy.spring;

/**
 * 1. 用advisor 的它的这个aspect类是有要求的, 例如这个DeveloperHelper 它必须要实现MethodBeforeAdvice,AfterReturningAdvice
 * 才能实现方法前增强和返回后增强
 * 
 * 2. 用aop:aspect的, 它的这个aspect类是没有多大要求但是在配置的时候, 具体配置哪种增强是要在配置文件中体现的.
 * 
 * 
 * */
public class AOPApp2 {
    public static void main(String[] args) {
        
    }
}
