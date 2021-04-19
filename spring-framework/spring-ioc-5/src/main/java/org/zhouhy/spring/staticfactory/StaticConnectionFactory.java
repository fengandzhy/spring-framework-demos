package org.zhouhy.spring.staticfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StaticConnectionFactory {
    
    public static Connection createConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/springframework-s?useSSL=false&serverTimezone=UTC","root","root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return connection;
    }

    public static Connection createConnection1(String driver,String url,String username,String pwd){
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,pwd);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
