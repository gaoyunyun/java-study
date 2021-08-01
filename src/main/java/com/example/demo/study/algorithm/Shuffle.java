package com.example.demo.study.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class Shuffle {

    public static void main(String[] args){
        //公平的随机算法
        int[] card={0,2,3,6,5,1,4};
        for(int i=card.length-1;i>0;i--){
            System.out.println(i);
            //生成[0,i]之间的随机数
            int random = random(i);
            //swap 和最后一个元素交换位置，每一次概率都为1/7
            int randomCard=card[random];
            Object tmp=card[i];
            card[i]=card[randomCard];
            card[randomCard]= (int) tmp;
        }
//        Collections.shuffle();
        System.out.println(Arrays.toString(card));

    }

    private static int random(int i) {
        Random random = new Random();
        return random.nextInt(i);
    }
}
