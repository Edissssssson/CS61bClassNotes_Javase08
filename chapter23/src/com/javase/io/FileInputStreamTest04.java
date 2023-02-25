package com.javase.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//基于03的最终版
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis=null;                               //读进去 read input
        try {
            fis =new FileInputStream("tempfile.txt");
            byte[] bytes =new byte[150];
            /*while(true){
                int readCount=fis.read(bytes);
                if(readCount==-1){
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }*/


            //关键的三行代码
            int readCount =0;
            while ((readCount=fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
