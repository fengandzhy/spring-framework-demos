package org.zhouhy.spring;


/**
 * 1. 关于这个ApplicationContext 实现事件传播, 必须有以下几个因素
 *  1) 事件源 继承了 ApplicationEvent 的类
 *  2) 监听者 继承了 ApplicationListener 的类
 *  3) 传播者 继承了 ApplicationContextAware 的类, 在这个类当中的ApplicationContext 是spring自动注入的
 *  4) 在spring 容器里只需要注册传播者和监听者, 不需要注册事件源.
 *  
 * 2. 关于spring 的自动装配请参看本例的几个例子, spring 一共有三种方式自动装配 byName, byType, constructor
 * 
 * */
public class IOCApp {
    public static void main(String[] args) {
        
    }
}
