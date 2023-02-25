package threadsafe;

public class AccountThread extends Thread {
//保证两个线程共享同一个账户对象
private  Account act;
public AccountThread (Account act){    //构造方法
    this.act=act;
}

    @Override
    public void run() {
     //run方法执行表示能取款操作
        double money=5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+"账户"+act.getActno()+"取款"+money+"成功，余额为"+act.getBalance());
    }
}
