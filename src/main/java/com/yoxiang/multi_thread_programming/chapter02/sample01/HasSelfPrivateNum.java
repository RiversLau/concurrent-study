package com.yoxiang.multi_thread_programming.chapter02.sample01;

/**
 * Author: Rivers
 * Date: 2017/12/28 06:46
 */
public class HasSelfPrivateNum {
    public void addI(String username) {
        int num = 0;
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
