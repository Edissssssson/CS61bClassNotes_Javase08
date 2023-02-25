package com.bjpowernode.javase.entity;

import java.util.*;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan");
        Student s2=new Student("zhangsan");
        System.out.println(s1.equals(s2));// Students类重写equals前 false 因为比的是内存地址
        System.out.println("s1的哈希值："+s1.hashCode());
        System.out.println("s2的哈希值："+s2.hashCode());
        Set<Student> students=new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());  //2  这个结果按说应该是1．但是结果是2.显然不符合HashSet集合存储特点。怎么办?
                                                                //重写后 s1 s2地址一样了 size也是1了 说明只加进去一个
    }
}
