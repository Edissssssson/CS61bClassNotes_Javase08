import java.util.ArrayList;
import java.util.List;

public class ThreadTest16 {
    public static void main(String[] args) {
//创建一个仓库对象
        List list=new ArrayList();
        //创建两个线程对象
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Cosumer(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
//一直生产 使用死循环模拟一直生产
        while(true){
            //给仓库对象list加锁                                                                                                                                           //加锁
            synchronized (list){
                if(list.size()>03){   //集合中有一个元素 满了 就要等待
                    try {
                        list.wait();  //当前线程进入等待状态，并且释放list集合锁，必须释放锁，不然notify没法操作这个对象,接着        //释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }//否则new 一个 加进去
                Object obj=new Object();
                Object obj2=new Object();
                Object obj3=new Object();
                list.add(obj);
                list.add(obj2);
                list.add(obj3);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj2);
                System.out.println(Thread.currentThread().getName()+"---->"+obj3);
                //唤醒消费者消费
                if(list.size()==3){
                    list.notify();      //用notifyAll也行，下面消费者也是 即使换醒本身 因为>0 还是会wait
                }

            }

        }
    }
}
class Cosumer implements Runnable{
    private List list;

    public Cosumer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        while(true){
            //给仓库对象list加锁                                                                                                                                           //加锁
            synchronized (list){
                if(list.size()==0){   //集合中没有元素  就要等待
                    try {
                        list.wait();  //当前线程进入等待状态，并且释放list集合锁，必须释放锁，然后生产者去执行锁        //释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //能到这里，说明元素大于0，要消费一个对象
                Object obj=list.remove(0);
                Object obj2=list.remove(1);
                Object obj3=list.remove(2);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj2);
                System.out.println(Thread.currentThread().getName()+"---->"+obj3);
                //唤醒生产者生产
                list.notify();
            }

        }
    }
}