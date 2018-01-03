package com.yoxiang.multi_thread_programming.chapter02.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:sample37
 */
public class Service {

    private String username;
    private String password;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
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
