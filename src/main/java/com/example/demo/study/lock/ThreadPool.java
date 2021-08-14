package com.example.demo.study.lock;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        //看源码其实也就是 new ThreadPoolExecutor
//        fixException();

        threadPoolExecutor();
    }


    private static void threadPoolExecutor() {
        /**
         * int corePoolSize, 核心线程池大小,每次创建线程的个数
         * int maximumPoolSize, 最大线程池大小。io密集-核心*2，cup密集-核心+1
         * long keepAliveTime, 线程最大空闲时间
         * TimeUnit unit, 时间单位
         * BlockingQueue<Runnable> workQueue 线程等待队列
         * threadFactory 线程创建工厂
         * handler 拒绝策略
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,10,27
                , TimeUnit.SECONDS, new ArrayBlockingQueue<>(500),Executors.defaultThreadFactory(),handler());
        for (int i = 0; i <100; i++) {
            int ticketNumber=i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"fff"+ticketNumber);
                }
            });
        }
    }

    /**
     * 拒绝策略
     * @return
     */
    private static RejectedExecutionHandler handler() {

        return new ThreadPoolExecutor.DiscardPolicy();
    }

    public static void fixException(){
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 100; i++) {
            int ticketNumber=i;
            executorService.execute(
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread().getName()+"开始啦：" + ticketNumber);
                        }
                    }
            );
        }
        executorService.shutdown();
    }
}
