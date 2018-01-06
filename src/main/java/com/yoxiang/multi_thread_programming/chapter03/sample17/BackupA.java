package com.yoxiang.multi_thread_programming.chapter03.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:50
 */
public class BackupA extends Thread {
    private DBTools tools;
    public BackupA(DBTools tools) {
        this.tools = tools;
    }

    @Override
    public void run() {
        tools.backupA();
    }
}
