package com.yoxiang.multi_thread_programming.chapter03.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:34
 */
public class RunTest2 {
    public static void main(String[] args) {
        try {
            String lock = new String("Hello");
            System.out.println("syn 前");
            synchronized (lock) {
                System.out.println("syn first line");
                lock.wait();
                System.out.println("syn after wait");
            }
            System.out.println("syn 后");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
