package com.nanjolono.test.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @program: test
 * @description: thread
 * @author: nanjolono
 * @create: 2020-10-22 20:29
 **/
public class ThreadUtil {
    static int num = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(num);
        CountDownLatch countDownLatch = new CountDownLatch(num);
        ThreadProcess tp = new ThreadProcess(countDownLatch);
        Thread2Process t2p = new Thread2Process(countDownLatch);
        int adds = 0 ;
        int mnults = 0;
        Future<Integer> add;
        Future<Integer> mult;
        try{
            for (int i = 0; i < 10 ; i++) {
                if(i<5){
                    add = executorService.submit(tp);
                    adds = adds + add.get();
                }else{
                    mult = executorService.submit(t2p);
                    mnults = mnults + mult.get();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            countDownLatch.await();
            System.out.println("adds"+adds);
            System.out.println("mnults"+mnults);
            int res = adds+mnults;
            System.out.println("res"+res);
        }
        executorService.shutdown();
    }
    private String getStrs(String tedst){
        String test = "12323";
        return getStrs(test);
    }
}
