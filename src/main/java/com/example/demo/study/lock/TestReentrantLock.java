package com.example.demo.study.lock;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 是显示的加锁，只可修饰方法块
 *
 * 如何让主线程停止，等子线程执行完了再执行？（wait-notify）
 */
public class TestReentrantLock {
    public static void main(String[] args) {
        //测试三个线程购买票，加锁后按顺序执行
        new LinkedList<>();
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
    static class MyThread implements Runnable{

        private final ReentrantLock reentrantLock= new ReentrantLock();
        int ticketNumber=10;
        @Override
        public void  run() {
            try {
                // lock 阻塞加锁
              reentrantLock.lock();
                while (true){
                    if(ticketNumber>0){
                        System.out.println(ticketNumber--);
                    }else {
                        break;
                    }
                }
            }finally{
                reentrantLock.unlock();
            }
        }
    }
}

