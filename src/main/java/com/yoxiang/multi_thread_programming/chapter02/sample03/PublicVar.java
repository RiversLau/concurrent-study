package com.yoxiang.multi_thread_programming.chapter02.sample03;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:18
 */
public class PublicVar {

    public String username = "A";
    public String password = "AA";
    public synchronized void setValue(String username, String password) {
        this.username = username;
        try {
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() +
                    " username =" + username + " password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name = " + Thread.currentThread().getName() +
                    " username = " + username + " password = " + password);
    }
}
