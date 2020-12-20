### Static Factory.
step1,
```
public class StaticConnectionFactory {
    
    public static Connection createConnection() throws Exception{
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");        
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/springframework-s?useSSL=false","root","root");        
        return connection;
    }
}
```
step2,
```
<bean id="conn1" class="org.zhouhy.springframework.factorybean.StaticConnectionFactory" 
          factory-method="createConnection"/>
```
step3,
```
    @Test
    public void test3(){
        Connection connection = (Connection) context.getBean("conn1");
        System.out.println(connection);
    }
```