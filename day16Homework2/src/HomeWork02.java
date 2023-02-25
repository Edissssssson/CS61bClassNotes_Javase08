public class HomeWork02 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(90,500);
        System.out.println("speed:"+v.getSpeed()+" size:"+v.getSize());
        v.move();
        System.out.println(v.speedUp(30));
        System.out.println(v.speedDown(20));
        System.out.println(v.speedUp(10));
        System.out.println(v.speedUp(20));
        System.out.println(v.speedUp(30));
    }
}
class Vehicle {
    private int speed;
    private double size;
    public Vehicle() {
    }
    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void move(){
        System.out.println("Vehicle is moving!");
    }
    public int speedUp(int a){
      this.setSpeed(getSpeed()+a); // this.speed+=a;  也可以
        return speed;
    }
    public int speedDown(int a){
        this.setSpeed(getSpeed()-a);  //this.speed-=a;  也可以
        return speed;
    }
}