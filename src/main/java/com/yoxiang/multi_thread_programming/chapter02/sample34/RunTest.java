package com.yoxiang.multi_thread_programming.chapter02.sample34;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:13
 */
public class RunTest {

    public static void main(String[] args) {
        PrintString ps = new PrintString();
        new Thread(ps).start();
        ps.setContinuePrint(false);
    }
}
