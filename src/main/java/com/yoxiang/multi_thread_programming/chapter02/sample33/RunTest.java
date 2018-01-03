package com.yoxiang.multi_thread_programming.chapter02.sample33;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:07
 */
public class RunTest {
    public static void main(String[] args) {
        PrintString ps = new PrintString();
        ps.printStringMethod();
        ps.setContinuePrint(false);
    }
}
