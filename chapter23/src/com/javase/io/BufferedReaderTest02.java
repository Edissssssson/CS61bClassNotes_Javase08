package com.javase.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args)throws  Exception {
      /*  FileInputStream in=new FileInputStream("tempfile.txt");                    //in是节点流 isr是包装流
        //不能直接将in传， 必须要用InputStreamReader 转换字节流为字符流
        InputStreamReader isr=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(isr);                                                 //isr是节点流  br是包装流*/

        //合并写法
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("tempfile.txt")));


        String s=null;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
