package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("F:\\录屏\\国内芬达.mp4");      //创建读入流对象
            fos=new FileOutputStream("E:\\国内芬达.mp4");  //创建写出流对象
            //最核心：一边读一边写
            byte[] bytes=new byte[1024*1024]; //一次最多拷贝一兆  1byte *1000=1k  1k*1000 =1M
            int readData=0;
            while((readData=fis.read(bytes))!=-1){
                fos.write(bytes,0,readData);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//分开try 不要一起try
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
