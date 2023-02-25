import java.util.TreeSet;
public class TreeSetTest05 {
    public static void main(String[] args) {
      //要求：按年龄升序，年龄一样 按姓名升序
        TreeSet<Vip> vips=new TreeSet<>();
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("zhangsi",25));
        vips.add(new Vip("yangsi",25));
        vips.add(new Vip("yangsi",35));
        vips.add(new Vip("Liangsi",15));
        for (Vip v :
                vips) {
            System.out.println(v);
        }
    }
}
class Vip implements Comparable<Vip>{
    String name;
    int age;
    public Vip() {
    }
    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重点是写compareTo方法
    @Override
    public int compareTo(Vip v) {
        if(this.age==v.age){
            //年龄相同，按姓名排序
            //姓名是String类型，可以值接比。调用compareTo来完成比较。
           return this.name.compareTo(v.name);
        }else{
            //年龄不一样
            return  this.age-v.age;
        }
    }
}
    /*Vip{name='Liangsi', age=15}
    Vip{name='zhangsan', age=20}
    Vip{name='yangsi', age=25}
    Vip{name='zhangsi', age=25}
    Vip{name='yangsi', age=35}*/
