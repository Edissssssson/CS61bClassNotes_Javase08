package reflect;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IOPropertiesTest {
    public static void main(String[] args) throws  Exception {
        /*String path=Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();//获取了文件的绝对路径
        FileReader reader=new FileReader(path); //以前是path这是 FileReader reader=new FileReader("P757chapter25/src/classinfo2.properties")*/
        InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");
        Properties pro=new Properties();
        //pro.load(reader);
        pro.load(in);
        //reader.close();
        in.close();
        String className=pro.getProperty("className");
        System.out.println(className);
    }

}
