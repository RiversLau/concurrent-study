package com.yoxiang.multi_thread_programming.chapter03.sample16;

import java.io.PipedWriter;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:35
 */
public class WriteThread extends Thread {
    private WriteData write;
    private PipedWriter writer;
    public WriteThread(WriteData write, PipedWriter writer) {
        this.write = write;
        this.writer = writer;
    }

    @Override
    public void run() {
        write.writeMethod(writer);
    }
}
