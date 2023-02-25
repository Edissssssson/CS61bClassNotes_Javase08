import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(1);
        Iterator it =c.iterator();
        while(it.hasNext()){
            Object o=it.next();
            if(o instanceof  Integer){
                System.out.println("Integer类型");
            }
            System.out.println(o);
        }
        System.out.println("-------");
        Collection c2=new HashSet();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(900);
        c2.add(300);
        c2.add(900);
        c2.add(300);
        c2.add(50);
        c2.add(100);      //未打印出 所以不可重复 Set子接口实现类不可重复
        Iterator it2=c2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
//1
//2
//3
//4
//1
      //  ArrayList 有序可重复
        //存进去是什么类型输出也是，只不过最后  System.out.println(o);时自动调用toString（）方法
    }
}
//50
//100
//900
//200
//300
//Set 子接口实现类 HashSet无序不可重复