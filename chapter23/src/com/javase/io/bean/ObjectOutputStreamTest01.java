package com.javase.io.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        //创建java对象
        Student s=new Student(1111,"zhangsan");
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(s);


        //刷新，关闭
        oos.flush();
         oos.close();



    }
}
