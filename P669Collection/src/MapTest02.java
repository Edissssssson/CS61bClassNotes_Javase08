import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"Langwu");
       /* //遍历map
        // 方法一 获取所有key，所有key是一个Set集合,通过key找value
        Set<Integer> keys= map.keySet();
        //对key进行遍历
        Iterator<Integer> it =keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value=map.get(key);
            System.out.println(key+"="+value);
        }
        // foreach
        System.out.println("-------");
        for (Integer  key:keys
             ) {
            System.out.println(key+"="+map.get(key));
        }*/
        System.out.println("方法二：");
        //方法二，用map.entrySet()直接将Map转为Set集合
        Set<Map.Entry<Integer,String>>set=map.entrySet();
        for(Map.Entry<Integer,String> m : set){
            System.out.println(m);      // m.getKey() +"="+m,getValue();也行
        }
        System.out.println("-----");
        Iterator<Map.Entry<Integer,String>> it2=set.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,String> m=it2.next();
           /* System.out.println(m);*/
            //这里m拆开分开拿key value也行
            Integer key=m.getKey();
            String value=m.getValue();
            System.out.println(key+"="+value);
        }
    }
}



