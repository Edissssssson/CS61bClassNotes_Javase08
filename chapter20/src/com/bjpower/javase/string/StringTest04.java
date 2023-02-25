package com.bjpower.javase.string;

public class StringTest04 {
    public static void main(String[] args) {
        String s1="hello";
         //s1这个变量中保存的是一个内存地址。
        // 按说以下应该输出一个地址。
        //但是输出一个字符串，说明string类已经重写了toString ()方法。
        System.out.println(s1); //.toString() 省略了      //hello
        // 001
        byte[] bytes ={97,98,99,100,102};
        String s2=new String(bytes);   //String构造方法里有 可以传进去byte类型的数组
        System.out.println(s2);  //.toString() 省略了         // abc
//前面说过∶输出一个引用的时候，会自动调用toString()方法默认Object的话，会自动输出对象的内存地址
// 通过输出结果我们得出一个结论: String类已经重写了toString( )方法。
// 输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。

        //String(字节数组， 数组元秦下标的起始位置, 长度)
        //作用：将byte数组中的一部分转换威字符串。

        String s3 = new String(bytes,1,4);
        System.out.println(s3);
        //002
        System.out.println("-------");
        char[] cha={'我','是','S'};
        String s=new String(cha);
        System.out.println(s);
        String ss=new String(cha,1,2);
        System.out.println(ss);
    }
}
