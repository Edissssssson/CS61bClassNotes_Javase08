package com.bjpowernode.javase.entity;

import java.util.*;

public class HashTableTest01 {
    public static void main(String[] args) {
        Map map=new Hashtable();
        /*map.put(null,null);
        System.out.println(map.isEmpty());
        System.out.println(map.size());//空指针异常
        map.put(null,"100aaa");
        System.out.println(map.size());//空指针异常*/
        map.put(3,"100aa");
        System.out.println(map.size());
    }
}
