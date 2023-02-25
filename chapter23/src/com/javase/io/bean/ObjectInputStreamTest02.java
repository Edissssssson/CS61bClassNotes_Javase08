package com.javase.io.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws  Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("users"));
        //Object obj=ois.readObject();   //这里的obj是个List集合，接下来强转即可
        List<User> userList= (List<User>)ois.readObject();
        for (User u :
                userList) {
            System.out.println(u);
        }

    }
}
