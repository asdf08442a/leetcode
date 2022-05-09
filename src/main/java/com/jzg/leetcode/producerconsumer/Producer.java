package com.jzg.leetcode.producerconsumer;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class Producer implements Runnable {

    private BlockingQueue<Product> blockingQueue;

    Producer(BlockingQueue<Product> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        AtomicInteger atomicInteger = new AtomicInteger();
        while (true) {
            try {
                Thread.sleep(200);
                if (blockingQueue.remainingCapacity() > 0) {
                    atomicInteger.getAndIncrement();
                    Product product = Product.builder()
                            .id(atomicInteger.get())
                            .name("test" + atomicInteger.get())
                            .build();
                    blockingQueue.put(product);
                    log.info("生产了，product:{}，队列size:{}", product, blockingQueue.size());
                } else {
                    log.info("队列已满");
                }
            } catch (InterruptedException e) {
                log.error("生产异常", e);
            }
        }
    }
}
