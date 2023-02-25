import java.util.ArrayList;
import java.util.*;
public class GenericTest {
    public static void main(String[] args) {

        /*不用泛型
      List myList=new ArrayList();
      Cat c=new Cat();
      Bird b=new Bird();
      myList.add(c);
      myList.add(b);
        System.out.println(myList.size());
        Iterator it=myList.iterator();
        while(it.hasNext()){
           Object obj= it.next();
           if(obj instanceof Animal){
               Animal a=(Animal)obj;
               a.move();
           }
        }*/
        //使用JDK5之后的泛型机制，使用泛型List<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        //这样用了泛型之后，集合中元素的数据类型更加统一了
        Cat c=new Cat();
        Bird b=new Bird();
        List<Animal> myList=new ArrayList<Animal>();
       //myList.add("abc");  报错
        myList.add(c);
        myList.add(b);
        System.out.println(myList.size());
Iterator<Animal> iterator=myList.iterator();
while(iterator.hasNext()){
    Animal animal=iterator.next();
animal.move();                                              //调用子类特有方法还是要instanceof下
if(animal instanceof Cat){
    Cat cat=(Cat)animal;
    cat.catchMouse();
}
if(animal instanceof Bird){
    Bird bird=(Bird) animal;
    bird.flying();
    }
}
    }
}
class Animal{
    public void move(){
        System.out.println("Animal is moving");
    }
}
class Cat extends Animal{
    public void catchMouse() {
        System.out.println("Cat is catching");
    }
}
class Bird extends Animal{
    public void flying() {
        System.out.println("Bird is flying");
    }
}