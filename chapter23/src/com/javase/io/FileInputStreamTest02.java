package com.javase.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis =new FileInputStream("D:\\classNote\\Temp.txt");
           /* while(true){
                int dataRead=fis.read();
                if(dataRead==-1){
                    break;
                }
                System.out.println(dataRead);
            }*/
            //改造while循环
            int dataRead=0;
            while ((dataRead=fis.read()) !=-1) {
                System.out.println(dataRead);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try{
                    fis.close();
                }
              catch(IOException e){
                    e.printStackTrace();
              }
            }
        }

    }
}
//文件是：abc   def @YZ
//97
//98
//99
//32
//32
//32
//100
//101
//102
//32
//64
//89
//90