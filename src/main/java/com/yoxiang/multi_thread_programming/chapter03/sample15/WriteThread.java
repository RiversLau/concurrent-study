package com.yoxiang.multi_thread_programming.chapter03.sample15;

import java.io.PipedOutputStream;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:20
 */
public class WriteThread extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public WriteThread(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
