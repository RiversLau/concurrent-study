package com.yoxiang.multi_thread_programming.chapter05.sample02;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 20:53
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行啦，时间=" + new Date());
    }
}
