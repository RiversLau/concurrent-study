package com.yoxiang.concurrency_interview.crawler;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: Rivers
 * @date: 2018/4/16
 */
public class FetchUrlThread implements Runnable {

    private final LinkedBlockingQueue<String> blockingQueue;

    public FetchUrlThread(LinkedBlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 1000; i++) {
                String url = "http://www.baidu.com/index_" + i + ".html";
                blockingQueue.add(url);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
