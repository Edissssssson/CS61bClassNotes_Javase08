package com.bjpower.javase.string;

public class StringTest01 {
    public static void main(String[] args) {
        //注意：！！！GC垃圾回收器不回释放字符串常量池中的常量的
        //str里保存的不是"asdfsf",是"asdfsf"在字符串常量池中的内存地址。
        //这两行代码表示底层创建了3个字符串对象，都在字符串常量池当中。效率高，不用new了，直接用
        String str="asdfsf";
        String str2="asdfsf"+"xy";       //"xy"也在字符串常量池中，但是没引用指向它，拼接完形成”asdfsfxy“ ,引用str2 指向新的字符串
      //只要new，就会堆里开一块空间，指向字符串常量池的“xy”，然后栈里的str3 指向堆内存
        String str3=new String("xy");

        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);   //true  "hello"保存在方法区的字符串常量池中，s1 s2中保存的内存地址一样的都指向”hello“
        String s3=new String("xyz");
        String s4=new String("xyz");
        System.out.println(s3==s4); // false
        //通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用==”
        // "=="不保险。应该调用string类的equals方法。
        System.out.println(s3.equals(s4)); // true        String类的equals方法把Object类中的equals方法重写了

       String k=new String("testString");
      //  String k=null;
        //引用都能.  对象都能.    ”testString“也是个对象
        System.out.println("testString".equals(k)); //最好用这种写法，因为可以避免空指针异常
        System.out.println(k.equals("testString"));
    }
}
