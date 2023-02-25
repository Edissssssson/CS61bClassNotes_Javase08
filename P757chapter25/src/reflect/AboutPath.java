package reflect;

public class AboutPath {
    public static void main(String[] args)throws  Exception {
           //这种写法跨操作系统，linux也是适用
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path);
        String path2 = Thread.currentThread().getContextClassLoader().getResource("bean/db.properties").getPath();
        System.out.println(path2);
    }
}
