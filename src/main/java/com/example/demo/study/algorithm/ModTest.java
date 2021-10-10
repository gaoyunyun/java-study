package com.example.demo.study.algorithm;


public class ModTest {
    public static void main(String[] args) {

        //取模运算，可用于水平分库分表，
        for (int j = 1; j <100; j++) {
            int i = Math.floorMod(j, 2);
            System.out.println(i);
        }

    }
}
