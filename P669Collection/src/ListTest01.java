import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import  java.util.List;
public class ListTest01 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        //List myList=new LinkedList();
        myList.add("A");
        myList.add("B" );
        myList.add("C" );
        myList.add("C" );
        myList.add("D" );
        myList.add(1,"111");  //下标为1 也就是第二个位置出现“111”其他元素后移
        Iterator it =myList.iterator();
        while (it.hasNext()){
          Object elt=  it.next();
            System.out.println(elt);

        }
        System.out.println("-----");
        Object obj=myList.get(3);
        System.out.println(obj);
        System.out.println("+++++");
        //List特有的遍历方式，因为List有序,Set没
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("---+++");
        System.out.println(myList.indexOf("C"));
        System.out.println(myList.lastIndexOf("c"));
        System.out.println(myList.remove(0));
        System.out.println("---");
        System.out.println(myList.get(0));
        System.out.println(myList.size());
        System.out.println(myList.set(0,"000000001"));
        System.out.println(myList.get(0));
    }
}
