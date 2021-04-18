package org.zhouhy.spring;


/**
 * 1. 关于这个c3p0 的 DataSource 必须引入两个依赖, 一个是mysql的连接 mysql-connector-java, 另外一个就是c3p0本身, 请参考本例pom文件
 * 
 * 2. 关于这个context命名空间的引入 光引入 xmlns:context="http://www.springframework.org/schema/context" 还不行, 
 * 还要在 schemaLocation 中加入context相关的解析文件
 * http://www.springframework.org/schema/context 
 * http://www.springframework.org/schema/context/spring-context-4.2.xsd
 * 
 * 3. 关于引入外部properties文件, 请参考本例c3p0
 * 1) 先把文件找到<context:property-placeholder location="classpath:db.properties"/>
 * 2) 根据键值对的方式 找到对应的值 <property name="user" value="${db.username}"/>
 * 
 * 
 * */
public class App {
    public static void main(String[] args) {
        
    }
}
