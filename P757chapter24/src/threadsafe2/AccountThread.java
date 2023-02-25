package threadsafe2;
public class AccountThread extends Thread {
//保证两个线程共享同一个账户对象
private Account act;
public AccountThread (Account act){    //构造方法
    this.act=act;
} //构造方法传递账户对象
    @Override
    public void run() {
     //run方法执行表示能取款操作
        double money=5000;
           //synchronized (this){                                                   //synchronized (this){//这里的this是AccountThread对象，这个对象不共享!
        synchronized (act){               //这里不能用this 两个AccountThread 两个内存地址，测试类中t1 t2.而act 是同一个账户对象
            act.withdraw(money);
        }

        System.out.println(Thread.currentThread().getName()+"对"+"账户"+act.getActno()+"取款"+money+"成功，余额为"+act.getBalance());
    }
}
