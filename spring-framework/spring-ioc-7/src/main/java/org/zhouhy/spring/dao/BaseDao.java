package org.zhouhy.spring.dao;

public class BaseDao<T> {
    
    public void add(T entity){
        System.out.println("传过来的是:"+entity);
    }
}
