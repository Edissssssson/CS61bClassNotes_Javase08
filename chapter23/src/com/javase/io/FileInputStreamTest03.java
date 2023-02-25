package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
           // fis =new FileInputStream("tempfile.txt");
            fis =new FileInputStream("chapter23/tempfile23");
            byte [] bytes=new byte[4];
            int byteCount=fis.read(bytes);     //byteCount 代表读了几个字节
            System.out.println(byteCount);     //返回是4  第一次读了四个字节
            //System.out.println(new String(bytes));    //abcd
            System.out.println(new String(bytes,0,byteCount)); //此时就是读几个 转几个
            byteCount=fis.read(bytes);
            System.out.println(byteCount);    //返回是2  第二次读两个字节
            //System.out.println(new String(bytes));   //efcd
            System.out.println(new String(bytes,0,byteCount)); //此时就是读几个 转几个
            byteCount=fis.read(bytes);          //返回是3            第三次读不到字节
            System.out.println(byteCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
