package com.example.demo.study.lock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 如何让子线程执行完了，再执行主线程
 * join 插队
 * 使用 future 机制-异步处理: 在阻塞的时候给假数据（submit），再等真的需要的时候再把真数据给他（get）
 */
public class TestThreadPoolBlock {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        testJoin();
        testFuture();
    }

    private static void testFuture() throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Future<?> submit = pool.submit(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(2);
                    return 2;
                }
        );
        Future<?> submit1 = pool.submit(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(3);
                    return 3;
                }
        );
        //阻塞掉线程池
        pool.shutdown();

        //get 再次调用如果有
        System.out.println(Thread.currentThread().getName() + ":" + submit1.get());
        System.out.println(Thread.currentThread().getName() + ":" + submit.get());
        System.out.println("结束");
    }

    private static void testJoin() throws InterruptedException {
        Thread thread1 = new Thread(new MyThread());
        Thread thread = new Thread(new MyThread());

        thread1.start();
        thread.start();
        thread1.join();
        thread.join();
        System.out.println("我被插队了");
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "开始啦！");
        }
    }
}

