public class HomeWorkTest04 {
    public static void main(String[] args) {
        Number number=new Number(8,9);
        System.out.println(number.multi(9,3));
        System.out.println(number.multi(22,2));
        Number number1=new Number(9,2);
        System.out.println(number.getN1());
        System.out.println(number.getN2());
        number.setN1(999);
        System.out.println(number.getN1());
        number.pri();
    }
}
class Number{
    private int n1;
    private int n2;
    public Number() {
    }
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN1() {
        return n1;
    }
    public int getN2() {
        return n2;
    }
    public int addition(int n1,int n2){
        return n1+n2;
    }
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int division(int n1,int n2){
        return n1/n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public  void pri(){
        System.out.println("number is "+n1+"and "+ n2);
    }
}