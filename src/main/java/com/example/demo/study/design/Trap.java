package com.example.demo.study.design;

public class Trap implements Observer {
    @Override
    public void update() {
        System.out.println("陷阱控制");
    }
}
