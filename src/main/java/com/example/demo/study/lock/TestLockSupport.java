package com.example.demo.study.lock;

import java.util.concurrent.locks.LockSupport;

/**
 *
 * https://www.cnblogs.com/jojop/p/13957027.html
 *
 * 线程的阻断与阻塞
 * interrupt 中断只是标志位，不单独影响线程的执行
 * park 阻塞是状态，需要线程自行决定何时启用
 * join 是线程的插队
 *
 */
public class TestLockSupport {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Mythread());
        thread.start();
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"主线程执行中");
        LockSupport.unpark(thread);
        System.out.println(Thread.currentThread().getName()+"主线程执行结束");
    }


}

class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        LockSupport.park();
        System.out.println(Thread.currentThread().getName()+"执行结束");
    }
}
