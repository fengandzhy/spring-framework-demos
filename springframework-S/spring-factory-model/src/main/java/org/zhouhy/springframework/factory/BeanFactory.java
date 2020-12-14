package org.zhouhy.springframework.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties = new Properties();
    
    static {
        InputStream inputStream = BeanFactory.class.getResourceAsStream("/application.properties");
        try {
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Object getBean(String beanName){
        Object ret = null;
        try {
            System.out.println(properties.getProperty(beanName));
            Class clazz = Class.forName(properties.getProperty(beanName));
            ret = clazz.newInstance();            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
