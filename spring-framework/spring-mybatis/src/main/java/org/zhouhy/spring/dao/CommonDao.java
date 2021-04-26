package org.zhouhy.spring.dao;

public interface CommonDao<T> {
    
    public void save(T entity);
}
