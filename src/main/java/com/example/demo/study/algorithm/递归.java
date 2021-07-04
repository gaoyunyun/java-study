package com.example.demo.study.algorithm;

public class 递归 {

    public static void main(String[] args){
        System.out.println(recursion(6));;
    }

    private static int recursion(int n) {
        if(n <1){
            throw new IllegalArgumentException("a");
        }
        if(n ==1){
            return 1;
        }
        System.out.println(n);
        return n*(recursion(n-1));
    }
}
