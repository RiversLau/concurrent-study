package com.yoxiang.multi_thread_programming.chapter03.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:51
 */
public class BackupB extends Thread {
    private DBTools tools;
    public BackupB(DBTools tools) {
        this.tools = tools;
    }

    @Override
    public void run() {
        tools.backupB();
    }
}
