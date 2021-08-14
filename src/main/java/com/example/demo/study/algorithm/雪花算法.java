package com.example.demo.study.algorithm;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Random;

/**
 * https://www.jianshu.com/p/2a27fbd9e71a
 * 分布式系统唯一全局 id 生成方式
 *
 * long 一共64位
 * 1位 固定0 为正数
 * 41位 时间戳，可用69年
 * 10位 机器位，1024台
 * 12位 序列号，4096每一毫秒id位数
 */
public class 雪花算法 {

    public static void main(String[] args ){
//        random();
        //获取当前时间戳
        //如果当前时间戳等于上一次的时间戳（说明在同一毫秒内）则加1，大于4096 则等到下一毫秒，不等于则重新置0
        //最后时间戳、机器位、序列号做位运算


    }

    private static void random() {
        //1,10之间随机数
        Random random = new Random();
        int i1 = random.nextInt(10)+1;
        //0,1之间随机数
        double random1 = Math.random();
        System.out.println(random1);
    }
}
