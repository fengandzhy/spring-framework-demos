package org.zhouhy.springframework.factorybean;

import java.sql.Connection;
import java.sql.DriverManager;

public class StaticConnectionFactory {
    
    public static Connection createConnection() throws Exception{
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");        
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/springframework-s?useSSL=false","root","root");        
        return connection;
    }
}
