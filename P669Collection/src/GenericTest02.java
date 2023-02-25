import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("www.aaa.com");
        str.add("www.bbb.com");
        str.add("www.ccc.com");
        Iterator<String> it=str.iterator();
        while(it.hasNext()){
            String str2=it.next();
            String str3=str2.substring(4);
            System.out.println(str3);
        }
    }
}
//aaa.com
//bbb.com
//ccc.com