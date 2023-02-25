package reflect;

import java.io.FileReader;
import java.util.Properties;

//验证反射机制灵活性
public class ReflectTest03 {
    public static void main(String[] args)throws  Exception {
//通过IO流读取classinfo.properties文件
        FileReader reader=new FileReader("P757chapter25/classinfo.properties");
        Properties pro=new Properties();    //key value 都是String
        pro.load(reader);
        reader.close();
        //通过key 获取value
        String className=pro.getProperty("className");
       // System.out.println(className);   //输出：bean.User
        Class c=Class.forName(className);
        Object obj=c.newInstance();
        System.out.println(obj);    //classinfoproperties里改为java.util.Date , 则输出Sun Feb 19 16:08:59 CST 2023
    }
}
