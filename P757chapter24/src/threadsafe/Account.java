package threadsafe;
//银行账户
//不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题。
public class Account {
    private  String actno;
    private  double balance;

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
    // t1 t2 多线程并发 执行或者withdraw方法，t1 t2两个栈 操作堆中new的同一个对象Account act
    public  void withdraw(double money){
        double before=this.getBalance();
        double after=before-money;
        //更新余额
        //思考:t1执行到这里了，但还没有来得及执行这行代码，t2线程进来withdraw方法了。此时一定出问题。但是
        //也有可能不出问题 t1正好setBalance完了 t2进来 所以就不出问题，因此 这是概率问题

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
