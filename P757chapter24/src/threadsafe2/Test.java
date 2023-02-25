package threadsafe2;
public class Test {
    public static void main(String[] args) {
        Account act=new Account("act-001",10000);   //创建一个账户对象
        Thread t1=new AccountThread(act);                                           //创建t1 t2两个线程对象   从而达到两个线程共享用一个账户对象
        Thread t2=new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
/*t1对账户act-001取款5000.0成功，余额为5000.0
        t2对账户act-001取款5000.0成功，余额为0.0
        并且执行会比异步慢一点*/

