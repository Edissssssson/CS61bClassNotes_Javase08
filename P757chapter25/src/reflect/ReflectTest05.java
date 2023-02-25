package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) throws  Exception{
    Class studentClass=Class.forName("bean.Students");
    String str=studentClass.getName();
    String str2=studentClass.getSimpleName();
        System.out.println("完整类名"+str);    //输出bean.Students
        System.out.println("简类名"+str2);   //输出Students
    Field[] fields=studentClass.getFields();   //获取public公开的属性
        System.out.println(fields.length);     //输出2 也就是两个public修饰的被获取了，Field数组里有两个元素

        Field[] fields1=studentClass.getDeclaredFields();   //获取定义了的属性,返回一个数组，相当于创建了数组
        System.out.println(fields1.length);  //输出5  确实有 name age sex no MATH_PI 五个元素
        System.out.println("=======");
        //增强for循环遍历
        for (Field fd :
                fields1) {
            Class ftype=fd.getType();
            int i=fd.getModifiers();                                //获得修饰符数字int i，然后再Modifier.toString(i),再打印输出
            String modiferString=Modifier.toString(i);
            System.out.print(modiferString+" ");
           // System.out.println(i);   //返回的修饰符是一个数字每一个数字是修饰符代号
            System.out.print(ftype.getSimpleName()+" ");  //获得类型名  //用getName（）的话就是java.util.String 这是完整类名
            System.out.println(fd.getName());        //获得变量名
        }

        Field f=fields[0];
        Field ff=fields[1];
        System.out.println("=====");
        System.out.println(f.getName());   //no            getName()获取属性名字
        System.out.println(ff.getName());  //MATH_PI
    }
}
