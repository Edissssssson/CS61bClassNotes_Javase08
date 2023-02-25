package reflect;

import java.sql.Ref;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle rb=ResourceBundle.getBundle("classinfo2");    //getBundle(） 是一个static方法
        String className=rb.getString("className");
        System.out.println(className);
        ResourceBundle rb2=ResourceBundle.getBundle("bean/db");
        String classNum=rb2.getString("classNum");
        System.out.println(classNum);
    }
}
//这样不用给流 不用Properties pro=new Properties 不用pro.loader(reader)