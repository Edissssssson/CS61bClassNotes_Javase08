package com.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws  Exception{
        FileReader reader=new FileReader("tempfile.txt");
        BufferedReader br=new BufferedReader(reader);
        String str=br.readLine();                   //读取一个文本行 但是不带换行符，还是println 换的行
        System.out.println(str);
        String str2=br.readLine();
        System.out.println(str2);
        System.out.println("----------------------------------------------------------");
String s=null;
while ((s=br.readLine())!=null){
    System.out.println(s);
}
        br.close();
    }
}
