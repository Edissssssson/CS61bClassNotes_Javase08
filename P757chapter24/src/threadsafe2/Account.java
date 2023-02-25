package threadsafe2;
//银行账户
//使用线程同步机制，解决线程安全问题。
public class Account {
    private  String actno;
    private  double balance;
    Object obj=new Object();
    public Account() {
    }
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
    public String getActno() {
        return actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
//取款方法
    public  void withdraw(double money){
        Object obj2=new Object();
        //synchronized (obj2){                                 // synchronized的括号里写线程共享的对象，对应线程才同步机制，就是排着队来执行{}里的，花括号里叫同步代码块
            double before=this.getBalance();
            double after=before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
     //   }
    }
}
