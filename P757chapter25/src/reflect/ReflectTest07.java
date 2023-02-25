package reflect;

import bean.Students;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) throws  Exception {
        Students s=new Students();
        s.no=1111;
        System.out.println(s.no);

        Class students=Class.forName("bean.Students");
        Object obj=students.newInstance();
        Field noField=students.getDeclaredField("no");
        noField.set(obj,2222);
        noField.set(obj,2223);
        System.out.println(noField.get(obj));
        //尝试访问私有属性
        Field nameField=students.getDeclaredField("name");
        nameField.setAccessible(true);  // 赋值前打破封装，但是这样也不好，容易犯罪
        nameField.set(obj,"jack");
        System.out.println(nameField.get(obj));//这样无法访问 //打破封装后可以直接访问
    }
}
