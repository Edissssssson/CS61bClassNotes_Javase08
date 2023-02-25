package com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("D:\\classNote\\Temp.txt");
                    //注意  此路径用了绝对路径
            int readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);

            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);
            readData= fis.read();
            System.out.println(readData);


        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }finally {
            if ( fis!= null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}