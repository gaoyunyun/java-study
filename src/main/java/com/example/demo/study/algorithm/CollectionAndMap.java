package com.example.demo.study.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionAndMap {
    public static void main(String[] args) {
        arrayList();
        linkList();
        //
        arrayListIndxOutOfBoundsException();
    }

    private static void arrayListIndxOutOfBoundsException() {
        List<String> list = new ArrayList<String>(10);
        list.add(2, "1");
        System.out.println(list.get(0));
    }

    private static ArrayList<String> arrayList() {
        //需要考虑扩容以及copy新数组.位移拷贝
        ArrayList<String> list = new ArrayList<String>(1);
        list.add("");
        return list;
    }

    private static void linkList() {
        //需要考虑实例化对象（每个节点）
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("f");
    }
}
