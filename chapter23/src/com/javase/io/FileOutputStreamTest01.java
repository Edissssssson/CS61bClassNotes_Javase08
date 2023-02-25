package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //myfile文件不存在时，会自动新建。
           // fos=new FileOutputStream("chapter23/tempfile");    //假如之前temp有内容会删了，重新写出abcdbcd

            fos=new FileOutputStream("chapter23/tempfile",true);    //原文件末尾加东西   abcdbcd _`abcd_`a _`abcd_`a
            byte[] bytes={32,95,96,97,98,99,100};
            //byte数组全部写出
            fos.write(bytes);                      //全部写出abcd
            fos.write(bytes,1,3); //跳过一个从第二个开始，写出3个字节  abcdbcd
            String s=" 97我是好人！！！！！";
            byte[] bs=s.getBytes();
            fos.write(bs);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
