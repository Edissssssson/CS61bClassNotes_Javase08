import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        Iterator it=c.iterator();
        //优化
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);

        }
        //迭代器对象it （图中箭头）开始在第一个元素之前。就是开始没指向任何元素
        /*boolean hasNext=it.hasNext();       //判断下一个有没
        System.out.println(hasNext);
        if(hasNext){
            Object obj=it.next();                  //有 就取出 给Object类的obj引用
            System.out.println(obj);
        }
        hasNext=it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj=it.next();
            System.out.println(obj);
        }
        hasNext=it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj=it.next();
            System.out.println(obj);
        }
        hasNext=it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj=it.next();
            System.out.println(obj);
        }
        hasNext=it.hasNext();
        System.out.println(hasNext);
        if(hasNext){
            Object obj=it.next();
            System.out.println(obj);
        }*/
    }
}
