package org.zhouhy.spring.factory;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    
    private static Properties properties;

    private static Map<String, Object> beans;
    
    static{
        properties = new Properties();
        try {
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(in);
            beans = new HashMap<>();

            Enumeration keys = properties.keys();
            while(keys.hasMoreElements()){
                String key = (String)keys.nextElement();
                String bean = properties.getProperty(key);
                Object obj = Class.forName(bean).newInstance();           
                beans.put(key,obj);
            }           
        } catch (IOException| IllegalAccessException| InstantiationException | ClassNotFoundException e ) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化properties失败");
        }        
    }
    
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
