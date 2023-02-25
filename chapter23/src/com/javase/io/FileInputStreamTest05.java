package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("tempfile.txt");
            System.out.println("总字节数量："+fis.available());
            byte[] bytes=new byte[fis.available()];   //这样不用循环读一次就行，但是不适合太大文件，byte[]数组不能太大
            //int read= fis.read();
            //System.out.println("还有多少字节没读："+fis.available());
          /*  int count=fis.read(bytes);
            System.out.println(new String(bytes));*/
            System.out.println("-----");
            fis.skip(1);
            System.out.println(fis.read());    //跳过a 直接读b 输出98
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
