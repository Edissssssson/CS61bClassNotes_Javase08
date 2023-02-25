import java.util.*;

public class ListTest03 {
    public static void main(String[] args) {
        List myList01=new ArrayList();
        List myList02=new ArrayList(100);
        Collection c=new HashSet();   //无序不可重复的
        c.add(100);
        c.add(1);
        c.add(123);
        c.add(1);
        c.add(5);
        c.add(59);
        c.add(5);
        System.out.println(c.size());
        System.out.println("-----");
        List myList03 =new ArrayList(c);
        for(int i =0;i<myList03.size();i++ ){
            System.out.println(myList03.get(i));
        }
    }
}
