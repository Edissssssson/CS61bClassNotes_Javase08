public class GenericTest03 <E>{
    public void doSome(E  o){
        System.out.println(o);
    }
    public static   void main(String[] args) {
        GenericTest03<String>  gt=new GenericTest03<>();  //此时规定String 或者Animal类后面gt调doSome（）方法就也是String
        gt.doSome("aaa");
    }
}
