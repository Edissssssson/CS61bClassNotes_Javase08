package deadlock;

import threadsafe.AccountThread;

public class Deadlock {
    public static void main(String[] args) {
Object o1=new Object();
Object o2=new Object();
Thread t1=new Mythread1(o1,o2);
Thread t2=new Mythread1(o1,o2);
t1.setName("t1");
t2.setName("t2");
t1.start();
t2.start();

    }
}

//t1 t2 两个线程共享o1 o2
class  Mythread1 extends Thread{
    Object o1;
    Object o2;

    public Mythread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
synchronized (o1){
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    synchronized (o2){

    }
}
    }
}
class  Mythread2 extends Thread{
    Object o1;
    Object o2;

    public Mythread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}

//目前这个程序还有概率可以执行，线程一锁住o1 o2 然后正好线程二开始，但是大概率是会正好锁住对方后面一个对象。
//如何保证一定锁住：
//总结： synchronized最好不要嵌套使用，容易发生死锁 你还不好找原因