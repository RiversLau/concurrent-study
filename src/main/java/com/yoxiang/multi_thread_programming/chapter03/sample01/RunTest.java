package com.yoxiang.multi_thread_programming.chapter03.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/4 21:43
 */
public class RunTest {
    public static void main(String[] args) {
        MyList ml = new MyList();
        ThreadA ta = new ThreadA(ml);
        ta.start();
        ThreadB tb = new ThreadB(ml);
        tb.start();
    }
}
