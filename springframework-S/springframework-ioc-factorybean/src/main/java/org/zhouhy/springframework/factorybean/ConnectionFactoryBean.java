package org.zhouhy.springframework.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.zhouhy.springframework.entity.DBParameters;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 类必须实现FactoryBean接口
 * */
public class ConnectionFactoryBean implements FactoryBean<Connection> {
    
    private DBParameters dbParameters;
    
    /**
     * 创建对象的逻辑
     * */
    public Connection getObject() throws Exception {
        Class.forName(dbParameters.getDriverClassName());
        Connection connection = DriverManager.getConnection(dbParameters.getUrl(),dbParameters.getUsername(),dbParameters.getPassword());
        return connection;
    }

    /**
     * 返回一个被创建对象的class对象
     * */
    public Class<?> getObjectType() {
        return Connection.class;
    }

    public boolean isSingleton() {
        return false;
    }

    public DBParameters getDbParameters() {
        return dbParameters;
    }

    public void setDbParameters(DBParameters dbParameters) {
        this.dbParameters = dbParameters;
    }
}
