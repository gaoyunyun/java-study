package com.example.demo.study.algorithm;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionAndMapTest {

    @Test
    public void deque(){
        //deque 可先入先出，先入后出
        ArrayDeque<Object> objects = new ArrayDeque<>();
        objects.add(1);
        objects.push(1);
        objects.addFirst(2);
        objects.offerFirst(2);
        objects.addLast(3);

    }

    @Test
    public void asList(){
        List<Integer> integers = Arrays.asList(1, 2, 3);
//        integers.add(8); Arrays.asList 构建的集合，不能再添加元素
        System.out.println(integers);
    }

    @Test
    public void arrayListIndxOutOfBoundsException(){
        ArrayList<String> strings = new ArrayList<>(10);
        System.out.println(strings);
        List<String> list = new ArrayList<String>(Collections.nCopies(9, "a"));
        System.out.println("初始化：" + list);
        list.add(2, "b");
        System.out.println("插入后：" + list);
    }

    @Test
    public void test_shuffle() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        Random random = new Random();
        for (int i = list.size(); i > 1; i--) {
            int ri = random.nextInt(i); // 随机位置
            int ji = i - 1; // 顺延
            System.out.println("ri：" + ri + " ji：" + ji);
            String set = list.set(ri, list.get(ji));//返回 oldValue
            System.out.println(set);
            String set1 = list.set(ji, set);// 元素置换
            System.out.println(list);
        }
        System.out.println(list);
    }
}