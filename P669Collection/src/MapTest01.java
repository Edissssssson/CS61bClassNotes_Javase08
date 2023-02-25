import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"aaa");                                                 //1 在这里自动装箱
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(4,"ddd");
        System.out.println(map.get(1));                         //通过键 返回值
        System.out.println(map.size());
       // map.remove(2);                                            //通过键 删除键值对
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(new Integer(4)));  //
        System.out.println(map.containsValue("ccc"));     // contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
        System.out.println(map.containsValue(new String("ccc")));  //比的是对象本身，所以新的String新的内存地址，但是还是true
        System.out.println(map.containsValue("eee"));
        System.out.println(map.size());
        System.out.println("-----");
        Collection<String> c= map.values();                                                                        //获取所有values
        for (String s:
             c) {
            System.out.println(s);
        }
        /*map.clear();
        System.out.println(map.size());   //0
        System.out.println(map.isEmpty());*/
    }
}
