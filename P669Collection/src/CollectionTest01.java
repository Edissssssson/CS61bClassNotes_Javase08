import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.add(true);
        System.out.println("集合中元素个数是："+c.size());
        c.clear();
        System.out.println("集合中元素个数是："+c.size());
        c.add("hello");
        c.add("毫克");
        boolean flag=c.contains("hello");
        System.out.println(flag);
        System.out.println(c.contains("kkk"));
        System.out.println("集合中元素个数是："+c.size());
        c.remove("hello");
        c.add("aaaaaaaaaa");
        c.add("aa");
        c.add(new Student());
        c.add(new Student());
        System.out.println("集合中元素个数最后是："+c.size());
        System.out.println(c.isEmpty());
        Object [] objects =c.toArray();
        for(int i =0;i<objects.length;i++){
            //System.out.println(objects[i]);
            Object o=objects[i];        //引用的方式也可以
            System.out.println(o);
        }
    }
}
class Student{

}