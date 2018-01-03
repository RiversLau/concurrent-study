package com.yoxiang.multi_thread_programming.chapter02.sample39;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:56
 */
public class Service {

    private boolean isContinue = true;

    // 注意去掉synchronized代码后的结果
    public void runMethod() {
        String anything = new String("abc");
        while( isContinue) {
            synchronized (anything) {}
        }
        System.out.println("开心的停不下来！");
    }

    public void stopMethod() {
        isContinue = false;
    }
}
