package com.example.demo.study.algorithm;

import java.util.HashMap;

public class RecursionNFactorialTest {

    public static void main(String[] args) {
        //10*9*8*7
        System.out.println(recursionN(10));
    }

    private static  int recursionN(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("参数必须大于0");
        }
        if (i == 1) {
            return 1;
        }
        System.out.println(i);
        return  i * recursionN(i-1);
    }


}
