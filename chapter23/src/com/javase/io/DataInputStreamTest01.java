package com.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws  Exception {
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));
        byte b=dis.readByte();
        short s=dis.readShort();
        int i=dis.readInt();
        long l=dis.readLong();
        float f=dis.readFloat();
        double d=dis.readDouble();
        boolean sex=dis.readBoolean();
        char c=dis.readChar();
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);

        dis.close();
    }
}
//100
//200
//400
//400
//3.0
//3.14
//false
//a