package com.javase.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args)throws  Exception {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data"));
        byte b=100;
        short s=200;
        int i=400;
        long l=400L;
        float f=3.0F;
        double d=3.14;
        boolean sex=false;
        char c='a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);
        dos.flush();
        dos.close();
        }
    }

//记事本打不开，按什么顺序写 就按什么顺序读
