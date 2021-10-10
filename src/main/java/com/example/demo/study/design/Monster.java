package com.example.demo.study.design;

public class Monster implements Observer {
    @Override
    public void update() {
        System.out.println("怪物攻击");
    }

    @Override
    public void test() {
        Observer.super.test();
    }
}
