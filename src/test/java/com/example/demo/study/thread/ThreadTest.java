package com.example.demo.study.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
    @Test
    public void creatorThread(){
        new Thread(()->{

        }).start();
    }
}
