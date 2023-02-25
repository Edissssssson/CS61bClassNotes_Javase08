package reflect;

public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("bean.Myclass");
        } catch (ClassNotFoundException e) {

        }

    }
}
//静态代码块执行了