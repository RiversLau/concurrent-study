package com.yoxiang.multi_thread_programming.chapter02.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:37
 */
public class Service {

    private String username;
    private String password;

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在" +
                        System.currentTimeMillis() + " 进入同步块");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在" +
                        System.currentTimeMillis() + " 离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
