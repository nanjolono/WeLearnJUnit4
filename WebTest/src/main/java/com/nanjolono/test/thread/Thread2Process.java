package com.nanjolono.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * @program: test
 * @description: business
 * @author: nanjolono
 * @create: 2020-10-22 20:52
 **/
public class Thread2Process extends ThreadParent implements Callable<Integer> {
    volatile int axw = 1;
    CountDownLatch countDownLatch;
    Thread2Process(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }
    private Integer getIndex() {
        par =par*2;
        System.out.println("乘法业务"+Thread.currentThread()+"value:"+axw);
        return par;
    }

    @Override
    public Integer call() throws Exception {
        Integer index;
        try{
            index = getIndex();
        }finally {
            countDownLatch.countDown();
            Thread.currentThread().interrupt();
        }

        return index;
    }
}
