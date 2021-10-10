package com.example.demo.study.design;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
abstract public class Subject {

    private ArrayList<Observer> observers=new ArrayList<>();

    public void attachObserver(Observer observer){
        observers.add(observer);
        System.out.println("注册");
    }

    public void detachObserver(Observer observer){
        observers.remove(observer);
        System.out.println("移除");
    }

    public void notifyObserver(){
        observers.forEach(Observer::update);
        System.out.println("通知");
    }
}
