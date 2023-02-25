package threadsafe3;

public class AccountThread extends Thread {
private Account act;
public AccountThread (Account act){    //构造方法
    this.act=act;
}

    @Override
    public void run() {
        double money=5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+"账户"+act.getActno()+"取款"+money+"成功，余额为"+act.getBalance());
    }
}
