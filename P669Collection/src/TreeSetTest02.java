import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {

       // TreeSet<String> t=new TreeSet<>();
        TreeSet<String> t=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);               //换下o1 o2顺序就结果反过来
            }
        });
        t.add("maa");
        t.add("bb");
        t.add("accc");
        t.add("Accc");
        System.out.println(t.size());
        for(String s: t){
            System.out.println(s);
        }
    }
}
//4
//Accc
//accc
//bb
//maa
