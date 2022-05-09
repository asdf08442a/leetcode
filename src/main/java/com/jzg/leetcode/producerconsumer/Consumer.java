package com.jzg.leetcode.producerconsumer;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

@Slf4j
public class Consumer implements Runnable {

    private BlockingQueue<Product> blockingQueue;

    Consumer(BlockingQueue<Product> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                Product product = blockingQueue.take();
                log.info("消费了，product:{}", product);
            } catch (InterruptedException e) {
                log.error("消费异常", e);
            }
        }
    }
}
