package org.zhouhy.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.zhouhy.spring.bean.DBParameters;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryBean implements FactoryBean<Connection> {

    private DBParameters dbParameters;    
    
    @Override
    public Connection getObject() throws Exception {
        Class.forName(dbParameters.getDriver());
        Connection connection = 
                DriverManager.getConnection(dbParameters.getUrl(),dbParameters.getUsername(),dbParameters.getPassword());
        return connection;
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public DBParameters getDbParameters() {
        return dbParameters;
    }

    public void setDbParameters(DBParameters dbParameters) {
        this.dbParameters = dbParameters;
    }
}
