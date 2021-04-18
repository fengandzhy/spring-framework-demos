package org.zhouhy.spring.bean;

import java.util.TimerTask;

public class CacheTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("I am here!");
    }
}
