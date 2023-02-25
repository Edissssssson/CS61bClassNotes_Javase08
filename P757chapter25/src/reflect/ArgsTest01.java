package reflect;

public class ArgsTest01 {
    public static void main(String[] args) {
m();
m(10);
m(10,20);
m(10,20,30);
m2(100,"aaa");
m2(100,"aaa","bbb");
//m2("aaa");      //整型 必须出现一次
m2(100);
m3("aa","bbb","cc","dddd","e");
String[] strs={"a","111","sss","sdfsfd1"};
m3(strs);
m3(new String[]{"wo","是","abc"});  //没必要
    }
    public static void m(int... args){
        System.out.println("m方法执行了");

    }
    public static void m2(int a,String... args){
        System.out.println("m2方法执行了");
    }
    public static void m3(String... args){
        for (int i=0;i< args.length;i++){
                System.out.println(args[i]);
    }
    }
}
//m方法执行了
//m方法执行了
//m方法执行了
//m方法执行了
//m2方法执行了
//m2方法执行了
//m2方法执行了
//aa
//bbb
//cc
//dddd
//e
//a
//111
//sss
//sdfsfd1
//wo
//是
//abc
//
//Process finished with exit code 0