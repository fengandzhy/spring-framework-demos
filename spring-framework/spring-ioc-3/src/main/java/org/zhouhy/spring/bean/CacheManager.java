package org.zhouhy.spring.bean;

import java.util.Timer;
import java.util.TimerTask;

public class CacheManager {
    
    public CacheManager(){
        Timer t = new Timer();
        TimerTask cacheTask = new CacheTask();
        //缓存刷新定时处理
        t.schedule(cacheTask,0,SystemSettings.REFRESH_CYCLE);
    }
}
