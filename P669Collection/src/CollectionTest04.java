import java.util.ArrayList;
import java.util.Collection;
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        String s1=new String("abc");
        String s2=new String("def");
        c.add(s1);
        c.add(s2);
        System.out.println("集合中元素个数是"+c.size());
        String x=new String("abc");
        String x1=new String("abc");
        System.out.println(c.contains(x));
        System.out.println(c.contains(x1));
        boolean flag=x.equals(s1);
        System.out.println(flag);
    }
}
