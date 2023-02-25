package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) throws  Exception{
        StringBuilder s=new StringBuilder();                           //为了拼接字符串
       Class studentClass=Class.forName("bean.Students");    //Students类对象
        //Class studentClass=Class.forName("java.lang.String");    //String类对象
        s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+" {");
        s.append("\n");
        Field[] field=studentClass.getDeclaredFields();                //类引用.getDeclaredFields（） 方法拿到属性及修饰符 类型放入数组，遍历数组
        for (Field fd:field
             ) {
            s.append("\t");
            s.append(Modifier.toString(fd.getModifiers()));  //修饰符拿到
            s.append(" ");
            s.append(fd.getType().getSimpleName());        //类型简介名拿到
            s.append(" ");
            s.append(fd.getName());                                    //变量名
            s.append("\n");
        }
        s.append("}");
        System.out.println(s);
    }
}

/*
//换成String类输出
public final class String {
    private final byte[] value
    private final byte coder
    private int hash
    private boolean hashIsZero
    private static final long serialVersionUID
    static final boolean COMPACT_STRINGS
    private static final ObjectStreamField[] serialPersistentFields
    public static final Comparator CASE_INSENSITIVE_ORDER
    static final byte LATIN1
    static final byte UTF16
}*/
/*//换成Students类输出
public class Students {
    private String name
    protected int age
    boolean sex
    public int no
    public static final double MATH_PI
}

  */
