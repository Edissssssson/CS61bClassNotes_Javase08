package com.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1=new File("D:\\course\\01-开课\\开学典礼.ppt");
        System.out.println(f1.getName());
        System.out.println(f1.isDirectory());//false 不是目录
        System.out.println(f1.isFile());// true 是文件

        long haoMiao=f1.lastModified();
        Date time=new Date(haoMiao);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str=sdf.format(time);
        System.out.println(str);

        System.out.println(f1.length());    //获取文件字节大小
    }
}
