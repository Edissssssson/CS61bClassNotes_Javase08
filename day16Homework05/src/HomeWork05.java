public class HomeWork05 {
    public static void main(String[] args) {
        Person person=new Person("Mike", 28);
        person.display();

    }

}
class Person{
      private  String name;
    private  int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display(){
        System.out.println(getName()+getAge());
    }
}