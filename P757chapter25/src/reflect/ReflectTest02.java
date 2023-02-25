package reflect;

import bean.User;

public class ReflectTest02 {
    public static void main(String[] args) {
        User u =new User();
        System.out.println(u);
        //以上是不用反射机制创建对象
        //以下是用反射机制创建对象
        try {
            Class c=Class.forName("bean.User");
            try {
                Object obj=c.newInstance();       //newsInstance() 已经过时  newInstance还是调用了User类的无参构造方法
                System.out.println(obj);       //bean.User@776ec8df
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
