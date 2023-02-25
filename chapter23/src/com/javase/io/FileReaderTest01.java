package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader=new FileReader("tempfile.txt");
            char[] chars=new char[4];//一次读四个字符
           /* int readCount =0;
            while ((readCount=reader.read(chars))!=-1){
                System.out.println(new String(chars,0,readCount));
        }*/

            //往char数组里读
            reader.read(chars);     //按字符方式读取 第一次a 第二次b 第三次c 第四次 d
            for (char cha :
                    chars) {
                System.out.println(cha);
            }


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
/*
输出结果：
        aaab
        bbcc
        cddd
        eeef
        ff*/
/*aaab
    bbcc
    cddd
    eeef
    ff你好
    我是AB
    C，他是
    @￥#w
    hy a
    re y
    ou s
    o se
    riou
     s*/


