package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//反射method
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        Class user=Class.forName("service.UserService");
        Method[] methods=user.getDeclaredMethods();
        for (Method md:methods
             ) {

            System.out.print(Modifier.toString(md.getModifiers())+" ");   //修饰符
            Class c= md.getReturnType();              //返回值类型
            System.out.print(c.getName()+" ");     //写成System.out.print(md.getReturnType().getName()+" ");
            System.out.println(md.getName());   //输出方法名 login logout
            Class[] parameterTypes=md.getParameterTypes();  //获取参数列表,先获取类型
            for (Class para:parameterTypes
                 ) {
                System.out.println(para.getSimpleName());     //输出String String  第二个方法没有参数列表 就没
            }
        }
    }
}
