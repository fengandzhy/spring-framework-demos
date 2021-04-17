package org.zhouhy.spring;


/**
 * 1. BufferedReader bufferedReader = new BufferedReader(new FileReader("bean.properties")); 这里的bean.properties指的是
 * 在这个工程目录下的bean.properties 
 * 
 * 2. InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties"); 这种方式读到的bean.properties
 * 就位于classpath 下面了
 * 
 * 3. 多例的缺点在于
 *  1) 多次创建对象的代价就是消耗性能，导致效率会低一些
 *  2) 相比较单例，jvm会回收较多的垃圾
 *  3) 获取速度比单例慢，因为单例除了第一次，其后都是从缓存中获取
 * 
 * 4. 单例的缺点在于就是在并发情况下，可能会出现线程安全问题, 解决的方法就是, 不要去操作改变成员变量
 * 
 * 
 * */
public class App {
    public static void main(String[] args) {
        
    }
}
