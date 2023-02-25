import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest06 {
    public static void main(String[] args) {

        //TreeSet<WuGui> wuGuis=new TreeSet<>();    这样是不行的
        //TreeSet<WuGui> wuGuis=new TreeSet<>(new WuGuiComparator()); //传了个乌龟比较器对象  //方法一
        //重点：比较器可以不写，使用匿名内部类的方式                                                                                //方法二：匿名内部类
        TreeSet<WuGui> wuGuis=new TreeSet<>(new Comparator<WuGui>() {
            //自动生成compare方法，改下return
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o2.age-o1.age;
            }
        })
        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(500));
        wuGuis.add(new WuGui(100));
        for (WuGui w :
                wuGuis) {
            System.out.println(w);
        }
    }
}
class WuGui{
    int age;
    public WuGui(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "乌龟【" +
                "age=" + age +
                '】';
    }
}
/*
class WuGuiComparator implements Comparator<WuGui>{    //匿名内部类直接new 一个Comparator
    //实现接口中的compare方法

    @Override
    public int compare(WuGui o1, WuGui o2) {
        //指定比较规则 按年龄排序
        return o2.age-o1.age;
    }
}*/
