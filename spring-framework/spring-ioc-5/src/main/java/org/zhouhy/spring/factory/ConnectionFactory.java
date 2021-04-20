package org.zhouhy.spring.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection createConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection 
                    = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring-framework?useSSL=false&serverTimezone=UTC","root","root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        return connection;
    }

    public Connection createConnection1(String driver,String url,String username,String pwd){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection
                    = DriverManager.getConnection(url,username,pwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
