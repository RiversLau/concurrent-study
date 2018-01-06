package com.yoxiang.multi_thread_programming.chapter03.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:50
 */
public class RunTest {
    public static void main(String[] args) {
        DBTools tools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB bt = new BackupB(tools);
            bt.start();
            BackupA at = new BackupA(tools);
            at.start();
        }
    }
}
