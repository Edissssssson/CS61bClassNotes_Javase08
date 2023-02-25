package com.javase.io;

import java.io.FileReader;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws  Exception{
        //Properties是—个Map集合，key和vaLue部是string类型。想将userinfo文件中的数据加载到Properties对象当中。
//新建一个输入流对象  //用FileInputStream也行
        FileReader reader=new FileReader("chapter23/userinfo.properties");
        Properties pro=new Properties();
        //使用load方法传一个file流进去
        pro.load(reader);  //文件中的数据顺着管道加载到Map集合中，其中等号=左边做key，右边做value
        String username=pro.getProperty("username");
        System.out.println(username);
        String password=pro.getProperty("password");
        System.out.println(password);
        String password2=pro.getProperty("password2");
        System.out.println(password2);



    }
}
