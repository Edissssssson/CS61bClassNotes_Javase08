package reflect;

import java.util.Date;

public class ReflectTest01 {
    public static void main(String[] args) {
        Class c1=null;
        Class c2=null;
        try {
             c1=Class.forName("java.lang.String");    //此时c1代表 D:\java8\jre\lib rt 打开 里面的java.lang.String.class文件，或者说c1代表String类型
             c2=Class.forName("java.util.Date");         //c2代表Date类型
            Class c3=Class.forName("java.lang.Integer");    //c3代表Integer类型
            Class c4=Class.forName("java.lang.System");    //c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String s="abc";
        Class x=s.getClass();
        System.out.println(c1==x);    //结果是true  ==判断的是内存地址，说明保存内存地址一样的,都指向方法区中的字节码文件String.class
        Date d=new Date();
        Class y=d.getClass();
        System.out.println(c2==y);  //true

        Class  class1=String.class;                      // class1代表String类型
        Class  class2=Date.class;                        // class2代表Date类型
        Class  class3=int.class;                             // class3代表int类型
        Class  class4=double.class;                        // class4代表double类型
        System.out.println(x==class1);   //true

    }
}
