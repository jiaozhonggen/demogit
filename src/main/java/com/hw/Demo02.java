package com.hw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            newFixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "----" + index);
                }
            });

        }
        newFixedThreadPool.shutdown();
    }
}