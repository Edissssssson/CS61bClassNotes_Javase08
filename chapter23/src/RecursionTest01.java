public class RecursionTest01 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public  static  int fib(int n){
        if(n==0){return 0; }
        if(n==1|| n==2){return  1;}
        else return fib(n-1)+fib(n-2);
    }
}
//结果5
// fib4                       +                      fib3
//fib3              fib2       1                                    fib2        1    fib1       1
//  fib2   1     fib1    1
//5个1相加