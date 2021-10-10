package com.example.demo.study.design;

public class Hero extends Subject{

    void move(){
        System.out.println("主角移动");
        notifyObserver();
    }

    public static void main(String[] args){
        Hero hero = new Hero();
        Monster monster = new Monster();
        Trap trap = new Trap();
        Treasure treasure = new Treasure();

        hero.attachObserver(monster);
        hero.attachObserver(trap);
        hero.attachObserver(treasure);
        hero.move();
    }
}

