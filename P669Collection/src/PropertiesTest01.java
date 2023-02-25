import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("111","aaa");
        properties.setProperty("222","bbb");
        System.out.println(properties.size());
        //通过key 获取value
        System.out.println("------");
        String s=properties.getProperty("111");
        String s2=properties.getProperty("111");
        String s3=properties.getProperty("111");
        String s4=properties.getProperty("111");
        String s5=properties.getProperty("111");
        String s6=properties.getProperty("111");
        String s7=properties.getProperty("222");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s);
    }
}
