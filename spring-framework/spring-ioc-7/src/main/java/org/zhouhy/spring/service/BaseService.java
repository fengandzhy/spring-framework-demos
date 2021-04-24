package org.zhouhy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zhouhy.spring.dao.BaseDao;

public class BaseService<T> {
    
    @Autowired
    private BaseDao<T> baseDao;
    
    public void add(){
        System.out.println("In the BaseService:"+baseDao);
    }

    public BaseDao<T> getBaseDao() {
        return baseDao;
    }
}
