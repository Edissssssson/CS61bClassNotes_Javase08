package com.javase.io.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws  Exception{
        List<User> userList=new ArrayList<>();
        userList.add(new User(1111,"zhangsan"));
        userList.add(new User(2222,"zhangsi"));
        userList.add(new User(3333,"zhangqi"));

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("users"));
        //序列化一个集合，这个集合中放了3个对象
        oos.writeObject(userList);
        oos.flush();
        oos.close();

    }
}
