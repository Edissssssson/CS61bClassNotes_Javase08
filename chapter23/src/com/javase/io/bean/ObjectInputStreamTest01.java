package com.javase.io.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest01 {
    public static void main(String[] args)throws  Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("students"));
        //开始返序列化
        Object obj=ois.readObject();
        //反序列化是一个学生对象，调用学生对象toString方法
        System.out.println(obj);
                ois.close();

    }
}
