package com.example.demo.study.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("jlkk");
        list.add("lopi");
        list.add("小傅哥");
        list.add("e4we");
        list.add("alpo");
        list.add("yhjk");
        list.add("plop");

        String[] tab = new String[8];

        for (String key:list){
            int idx = key.hashCode() & (tab.length - 1);
            System.out.println(String.format("key 值=%s Idx=%d", key, idx));
            if(null==tab[idx]){
                tab[idx]=key;
                continue;
            }
            tab[idx]=tab[idx]+"->"+key;
        }

        HashMap<String,String> map = new HashMap<String, String>();
        map.put(null,null);
        map.keySet();
        System.out.println(tab);

    }
}
