package com.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws  Exception{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter( new FileOutputStream("temfile002.txt",true)));
        bw.write("Hello world");
        bw.write("\n");
        bw.write("hello kitty");
        bw.write("\n");
        bw.write("why so serious");
        bw.flush();
        bw.close();
    }
}
