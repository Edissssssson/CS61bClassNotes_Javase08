package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {
    public static void main(String[] args) {
        FileReader in=null;
        FileWriter out=null;
        try {
            in=new FileReader("C:\\Users\\WHF\\IdeaProjects\\December\\javase\\mywrite");
            out=new FileWriter("E:\\mywrite");
            out.flush();
            char[] chars=new char[4];
            int readAcount =0;

            while((readAcount=in.read(chars))!=-1){
                out.write(chars,0,readAcount);
            }
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
    }
}
