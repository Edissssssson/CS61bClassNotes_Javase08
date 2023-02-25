import java.util.*;

public class ListTest02 {
    public static void main(String[] args) {
        List myList01=new ArrayList();            //默认初始化容量是10
        int a= myList01.size();                      //size()获得集合容量 不是元素个数
        System.out.println(a);
        List myList02=new ArrayList(20);
        System.out.println(myList02.size());
        myList02.add(1);
        myList02.add(2);
        myList02.add(3);
        myList02.add(4);
        myList02.add(5);
        myList02.add(6);
        myList02.add(7);
        myList02.add(8);
        myList02.add(9);
        myList02.add(10);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(11);
        myList02.add(21);
        System.out.println(myList02.size());
    }
}
