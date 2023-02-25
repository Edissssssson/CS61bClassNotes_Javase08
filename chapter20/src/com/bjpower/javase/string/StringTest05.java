package com.bjpower.javase.string;

import java.util.Locale;

public class StringTest05 {
    public static void main(String[] args) {
       char c = "中国美  景".charAt(5);   //两个空格 也算 0 1 2 3 4 5
        System.out.println(c);  //”景“

        //字符串之间比较大小不能亘接使用><，需要使用compareTo方法。
        //拿着字符串第一个字母和后面字符串的第一个字母比较。能分胜负就不再比较了。

        System.out.println("abc".compareTo("abc"));               //0
        System.out.println("abc".compareTo("bcaaaaaaa"));     //小于0    -1
        System.out.println("abc".compareTo("aba"));     //大于0    2
        //contains方法
        System.out.println("Hello world.java".contains(".java"));//true
        System.out.println("Hello world.java".contains(". java"));//false    多一个空格
        System.out.println("asdffffcup".endsWith("cuo"));  //false
        System.out.println("asdffffcup".endsWith("cup"));  //true
        System.out.println("ABc".equals("abC"));// false
        System.out.println("ABc".equalsIgnoreCase("abC"));// true
        System.out.println("-------");
        byte[] bytes="abcdef".getBytes();
        for(int i=0; i<bytes.length;i++){
            System.out.println(bytes[i]);
        }
        System.out.println("what are you doing now!".indexOf("are"));     //012345   a首先在第五个下标出现
        String s=" ";
        System.out.println(s.isEmpty()); //false  因为有看空格  ；  空格都咩有 就是true 真的空
        System.out.println("abcefdgertdabc".lastIndexOf("abc"));  //11
        System.out.println("http//:www.google.com".replace("http//","https//"));
        // "="全部换“：”
        String newString= "name=zhangsan,age=19,score=99".replace("=",":");
        System.out.println(newString);  //name:zhangsan,age:19,score:99
        System.out.println("------");
        String[] newS="2023-01-29".split("-");
        for(int i=0;i<newS.length;i++){
            System.out.println(newS[i]);
        }
        System.out.println("-------");
        System.out.println("http://www.google.com".startsWith("http"));      //true
        System.out.println("http://www.google.com".startsWith("https"));   //false
        System.out.println("-------");
        System.out.println("http://www.google.com".substring(7));    //从下标7开始 截到结束     www.google.com
        System.out.println("http://www.google.com".substring(7,10));    //从下标7开始 截到结束  www   左闭右开
        System.out.println("------");
        char[] chars="我是大宝贝!".toCharArray();
        char[] chars1="I am gorgerous!".toCharArray();
        for(int i =0; i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        for(int i =0; i<chars1.length;i++){
            System.out.print(chars1[i]+" ");  //我 是 大 宝 贝 !       I   a m   g o r g e r o u s !
            System.out.println("+++++++");
            System.out.println("Abc is Gone".toLowerCase());  //abc is gone
            System.out.println("Abc is Gone".toUpperCase(Locale.ROOT));  //ABC IS GONE
            System.out.println("Abc is Gone".toUpperCase());  //ABC IS GONE
            System.out.println("*****");
            System.out.println("     hell  o      my     friend     ".trim());    //hell  o      my     friend
            System.out.println("*******");
            System.out.println(String.valueOf(true));          // true      将布尔类型true转为字符串true
            System.out.println(String.valueOf(1254));          // 1254
            System.out.println(String.valueOf("abus 12e"));  // abus 12e
            System.out.println(String.valueOf(1234l));  //  1234
            System.out.println(String.valueOf(123.0987));   //123.0987
            String sCus=String.valueOf(new Customer());
            System.out.println(sCus);     //没有重写toString时    com.bjpower.javase.string.Customer@5b480cf9
            System.out.println(sCus);    //重写后"我是一个VIP"
            System.out.println(String.valueOf(new Customer()));
            System.out.println(100);
            System.out.println(100.15);
            System.out.println("abc");
        }
    }
}
class Customer{
    @Override
    public String toString() {
        return "我是一个VIP";
    }
}