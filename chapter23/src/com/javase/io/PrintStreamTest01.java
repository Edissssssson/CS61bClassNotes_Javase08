package com.javase.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args)throws  Exception {
        System.out.println("hello motor");
        PrintStream ps=System.out;
        ps.println("Hello wangwu");
        ps.println("Hello LL");
        ps.println("Hello Liu");
        //以上输出到控制台
        PrintStream ps2=new PrintStream(new FileOutputStream("log"));
        System.setOut(ps2);     //改变方向，输出到log中
        System.out.println("zhangsan");
        System.out.println("zhangsi");
        System.out.println("zhangqi");

    }
}
