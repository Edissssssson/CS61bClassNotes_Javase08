import java.util.*;
public class CollectionsTest01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();    //ArrayList<>() 本身不是线程安全的
        Collections.synchronizedList(list);         //调用synchronizedList（）变成线程安全的
        list.add("abc");
        list.add("abf");
        list.add("abx");
        list.add("abe");
        Collections.sort(list);
        for (String str :
                list) {
            System.out.println(str);
        }
        //对List集合排序
        System.out.println("-----");
List<WuGui2> wuGui2s=new ArrayList<>();
        wuGui2s.add(new WuGui2(1000));
        wuGui2s.add(new WuGui2(800));
        wuGui2s.add(new WuGui2(500));
        wuGui2s.add(new WuGui2(100));
        Collections.sort(wuGui2s);                                   //对WuGui2排序，必须实现Comparable接口
        for (WuGui2 w :
                wuGui2s) {
            System.out.println(w);
        }
    //对Set集合排序
        System.out.println("-------");
        Set<String> set=new HashSet<>();
        set.add("king");
        set.add("king2");
        set.add("king1");
        set.add("kinga");
        set.add("kingA");
        set.add("kingx");
        set.add("kingX");
        set.add("king-1");
        set.add("king-100");
        List<String> myList=new ArrayList<>(set);
        Collections.sort(myList);
        for (String str:myList
             ) {
            System.out.println(str);
        }
    }
}
    /*abc
       abe
       abf
       abx*/
        /*king
        king-1
        king-100
        king1
        king2
        kingA
        kingX
        kinga
        kingx*/
class WuGui2 implements  Comparable <WuGui2>{                 //对WuGui2排序，必须实现Comparable接口
         int age;
        public WuGui2(int age) {
            this.age = age;
        }
        @Override
        public int compareTo(WuGui2 o) {
            return this.age-o.age;
        }
        @Override
        public String toString() {
            return "WuGui2{" +
                    "age=" + age +
                    '}';
        }
    }