package com.example.demo.study.design;

/**
 * 观察者
 */
public interface Observer {

    void update();

    public default void test(){

    };
}
