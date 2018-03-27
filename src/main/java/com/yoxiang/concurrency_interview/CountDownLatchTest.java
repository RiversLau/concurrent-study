package com.yoxiang.concurrency_interview;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch是一个同步辅助类，用于当一组线程完成一系列操作时，其他阻塞线程才能执行，否则就一直等待
 * 构建该对象时会指定一个数值，通过减计数的方式来监听当前线程对象个数
 * 当计数为0时，释放所有等待中的线程（latch.await()）
 * 其中主要的方法有两个countDown()和await()，countDown()方法调用会使得计数减去一，
 * await()只会阻塞当前线程，不会影响计数，计数为0后，当前线程才能继续执行
 *
 * 想到一个形象的例子来表示CountDownLatch：有点像跟团旅游，导游会带领固定人数的团，到达旅游地点后，
 * 导游宣布大家自己随便参观游玩吧，咱们四点在这里集合；然后等到临近下午四点，到一个人，导游就减一，等
 * 减到0的时候，所有人都回来了，导游今天的任务就结束了。
 * 而CyclicBarrier则在此基础上多了一个，就是旅游地点比较大，比如像故宫，有好多处景点，到了一处，导游就说
 * 大家自由参观20分钟，20分钟后咱们集合，20分钟后陆续有人回到导游身旁，回来一个导游加一，等加到跟原始人数
 * 一致时，带领大家去下一个景点，如此循环往复。
 *
 * 稍微欠妥的就是，线程countDown()之后，可以继续干自己的事情，而上述比喻中，则要跟随导游；
 * 而CyclicBarrier则是在await()之后，不能继续干自己的事情，需要等到导游处理完后才能干自己的事情；
 *
 *
 * @author: Rivers
 * @date: 2018/3/27 16:57
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(new ReadNum(i, countDownLatch)).start();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(new WriteNum(i, countDownLatch)).start();
        }
        countDownLatch.await();
        System.out.println("所有线程执行结束");
    }

    static class ReadNum implements Runnable {

        private int id;
        private CountDownLatch latch;

        public ReadNum(int id, CountDownLatch latch) {
            this.id = id;
            this.latch = latch;
        }

        @Override
        public void run() {
            synchronized (this) {
                System.out.println("id:" + id);
                latch.countDown();
                System.out.println("线程" + id + "执行完毕");
            }
        }
    }

    public static class WriteNum implements Runnable {

        private int id;
        private CountDownLatch latch;

        public WriteNum(int id, CountDownLatch latch) {
            this.id = id;
            this.latch = latch;
        }

        @Override
        public void run() {
            synchronized (this) {
                try {
                    latch.await();
                    System.out.println("Hello " + id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
