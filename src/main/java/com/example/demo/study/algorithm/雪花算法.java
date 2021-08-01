package com.example.demo.study.algorithm;

import java.util.Random;

/**
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
        //获取时间戳
        //如果当前时间戳等于上一次的时间戳则加1，大于则置为0
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
