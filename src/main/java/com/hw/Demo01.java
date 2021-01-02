package com.hw;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        ExecutorService pool= Executors.newFixedThreadPool(1);
        pool.execute(new Runnable() {

            public void run() {
                System.out.println("4.我是通过线程池（调执行器的静态方法）方式启动的线程");
            }
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pool.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {

            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {

                public void run() {
                    System.out.println(index+"threadName："+Thread.currentThread().getName());
                }
            });
            if (i%2==0){
                cachedThreadPool.execute(new Runnable() {

                    public void run() {
                        System.out.println(index+"threadName："+Thread.currentThread().getName());
                    }
                });
            }
        }


        cachedThreadPool.shutdown();
        System.out.println("完成");
    }
}
