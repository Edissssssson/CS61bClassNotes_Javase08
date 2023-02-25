package com.javase.io;
import java.io.*;
public class CopyAll {
    public static void main(String[] args) {
        File old=new File("D:\\course");
        File targeted=new File("C:\\");
        copyDir(old,targeted);                                                                             //主方法里调用copyDir方法
    }
    private static void copyDir(File old, File targeted) {                                    //注意，第一次调时 传进去是个文件夹，所以不执行那个isFile，先执行isFile
        if(old.isFile()){
            FileInputStream in=null;
            FileOutputStream out=null;
            try {
                in=new FileInputStream(old);
                String path=(targeted.getAbsolutePath().endsWith("\\")?targeted.getAbsolutePath(): targeted.getAbsolutePath()+"\\")+old.getAbsolutePath().substring(3);
                out =new FileOutputStream(path);
//关键是一边读一边写
               byte[] bytes=new byte[1024*1024];  //一次读一兆
               int readCount=0;
               while((readCount=in.read(bytes))!=-1){
                   out.write(bytes,0,readCount);
               }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(out!=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;  //如果拿到的是个文件就停止递归
        }
        File[] files=old.listFiles();  //不管是文件还是文件夹，先整到数组里
        //System.out.println(files.length);   //测试：输出是4
        for (File file :
                files) {
            if(file.isDirectory()){
                //新建对应目录
               // System.out.println(file.getAbsolutePath());   //拿到源目录  D:\course\01-开课
                                                                                        //我们目的是C盘中建立 C:\course\01-开课
                String str=file.getAbsolutePath();
                //System.out.println(str.substring(3));               // 0 1 2 3都去掉,只剩course\01-开课
                String des=(targeted.getAbsolutePath().endsWith("\\")?targeted.getAbsolutePath(): targeted.getAbsolutePath()+"\\")+str.substring(3);                       //可以写C:\\ ,但是为了不写死,写成targeted.getAbsolutePath()
                System.out.println(des);
                File newFile=new File(des);
                if(!newFile.exists()){
                    newFile.mkdirs();                                            //此时所有文件夹目录就都出来了
                }
            }
            //System.out.println(file.getAbsolutePath());                                           //不管每个文件下不管文件还是文件夹先拿到绝对路径了
            copyDir(file,targeted);                                                                          //每次都把File数组里的一个个对象当源文件再执行copyDir方法
        }
    }
}
