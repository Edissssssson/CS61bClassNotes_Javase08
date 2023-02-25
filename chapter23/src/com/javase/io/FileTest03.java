package com.javase.io;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File f=new File("D:\\course\\01-开课");
        File[] files=f.listFiles();
        for (File file :
                files) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("-------");
        for (File file :
                files) {
            System.out.println(file.getName());
        }

    }
}
//D:\course\01-开课\2022年建筑行业收入调查表.url
//D:\course\01-开课\学习方法.txt.txt
//D:\course\01-开课\开学典礼.ppt
//D:\course\01-开课\苹果.txt
//-------
//2022年建筑行业收入调查表.url
//学习方法.txt.txt
//开学典礼.ppt
//苹果.txt