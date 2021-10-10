package com.example.demo.study.design;

public class Treasure implements Observer {
    @Override
    public void update() {
        System.out.println("获得宝物");
    }
}
