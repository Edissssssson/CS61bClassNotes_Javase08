package com.javase.io;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) throws  Exception{
        File f=new File("D:/a/b/c/d/e/f/file");
        System.out.println(f.exists());// true
        //如果不存在，以文件形式创建
       /* if(!f.exists()){
            f.createNewFile();
        }*/
        //如果不存在以目录的形式创建
        /*if(!f.exists()){
            f.mkdir();
        }*/
        //创建多重目录
        if(!f.exists()){
            f.mkdirs();
        }
        File f3=new File("D:\\course\\01-开课\\学习方法.txt.txt");
        String parentPath=f3.getParent();
        System.out.println(parentPath);   //D:\course\01-开课
        //方法二
        File f4=f3.getParentFile();
        System.out.println(f4.getAbsolutePath());  //D:\course\01-开课
        File f5=new File("copy");
        System.out.println(f5.getAbsolutePath());// C:\Users\WHF\IdeaProjects\December\javase\copy
    }
}
