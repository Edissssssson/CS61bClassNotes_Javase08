import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        User u1=new User("Jack");
        User u2=new User("Jack");
        c.add(u1);
        System.out.println(c.contains(u2));
        boolean flag=u1.equals(u2);
        System.out.println(flag);// User类没重写 equals方法 还是调的Object类的，所以== 判断的是 u1 u2 两个内存地址 所以false
        System.out.println(flag);//重写后 就是true
        System.out.println(c.size());
        c.add(u2);           //假如不加入u2 因为User类重写了equals 也可以达到删除u2 u1就没了 c.size() 为0
        System.out.println(c.size());
        c.remove(u2);
        System.out.println(c.size());
        System.out.println("-----");
        Collection cc=new ArrayList();
        String s1=new String("hello");
        String s2=new String("hello");
        cc.add(s1);
        System.out.println(cc.size());
        cc.remove(s2);
        System.out.println(cc.size());  // String 类重写了equals方法了 所以删s2 相当于删了 s1
    }
}
class User{
    private  String name;
    public User() {
    }
    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }


}