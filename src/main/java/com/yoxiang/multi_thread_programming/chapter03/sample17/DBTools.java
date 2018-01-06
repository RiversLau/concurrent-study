package com.yoxiang.multi_thread_programming.chapter03.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:45
 */
public class DBTools {
    private volatile boolean preIsA = false;
    public synchronized void backupA() {
        try {
            while (preIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★★");
            }
            preIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backupB() {
        try {
            while (!preIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆☆");
            }
            preIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
