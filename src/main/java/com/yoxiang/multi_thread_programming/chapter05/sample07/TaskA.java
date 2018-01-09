package com.yoxiang.multi_thread_programming.chapter05.sample07;

import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:45
 */
public class TaskA extends TimerTask {

    private int i;
    public TaskA(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第" + i + "次没有被cancel取消。");
    }
}
