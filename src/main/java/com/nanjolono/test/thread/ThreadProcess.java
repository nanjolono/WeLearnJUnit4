package com.nanjolono.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * @program: test
 * @description: process
 * @author: nanjolono
 * @create: 2020-10-22 20:30
 **/
public class ThreadProcess extends ThreadParent implements Callable<Integer> {
    volatile int sum = 1;
    CountDownLatch countDownLatch;

    ThreadProcess(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    private Integer getIndex() {
        sum = sum + 1;
        System.out.println("加法业务" + Thread.currentThread() + "value:" + sum);
        return sum;
    }

    @Override
    public Integer call() throws Exception {
        Integer index;
        try {
            index = getIndex();
        } finally {
            countDownLatch.countDown();
            Thread.currentThread().interrupt();
        }
        return index;
    }
}
