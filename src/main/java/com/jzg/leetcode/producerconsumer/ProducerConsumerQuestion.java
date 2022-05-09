package com.jzg.leetcode.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerQuestion {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Product> blockingQueue = new LinkedBlockingQueue<>(20);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);

        new Thread(producer).start();
        Thread.sleep(10000);
        new Thread(consumer).start();
    }

}
