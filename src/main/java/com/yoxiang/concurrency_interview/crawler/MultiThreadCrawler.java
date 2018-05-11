package com.yoxiang.concurrency_interview.crawler;

import java.util.concurrent.*;

/**
 * @author: Rivers
 * @date: 2018/4/16
 */
public class MultiThreadCrawler {

    private static final Integer MAX_COUNT = 1000;
    private static final LinkedBlockingQueue<String> waitingQueue = new LinkedBlockingQueue<>(MAX_COUNT);

    public static void main(String[] args) {
        // 定时任务从数据库拉取待爬取URL，放入waitingQueue
        Thread fetchThread = new Thread(new FetchUrlThread(waitingQueue));
        fetchThread.start();

        ExecutorService pool = Executors.newFixedThreadPool(10);
        new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

        while (!waitingQueue.isEmpty()) {
            final String url = waitingQueue.poll();
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("crawl url:" + url);
                }
            });
        }
    }
}
