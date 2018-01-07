package com.yoxiang.multi_thread_programming.chapter04.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/8 07:01
 */
public class RunTest2 {
    public static void main(String[] args) {
        // 生产者、消费者启动多个，如果MyService使用signal方法，而不是signalAll方法就会
        // 出现假死
        MyService service = new MyService();
        for (int i = 0; i < 10; i++) {
            ThreadA ta = new ThreadA(service);
            ta.start();
            ThreadB tb = new ThreadB(service);
            tb.start();
        }
    }
}
