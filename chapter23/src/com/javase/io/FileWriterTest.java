package com.javase.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out=null;
        try {
            out=new FileWriter("mywrite",true);
            out.write("我是大人！");
            char[] chars={'我','是','你','L'};
            out.write(chars);
            out.write(chars,1,2);
            out.write("\n");                                            //换行
            out.write("why can you believe him?");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
