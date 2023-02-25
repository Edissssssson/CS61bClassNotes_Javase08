public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t=new Thread(new Mythread08());
        t.setName("t");
        t.start();
        try {
            t.sleep(1000*5);                          //主线程活干5秒，希望五秒之后分支休眠醒来（分支也睡了五秒）
        } catch (InterruptedException e) {
            e.printStackTrace();                             //本行可以注释，就不打印异常信息
        }
        t.interrupt();                                              ///终断t线程的睡眠（这种终断睡眠的方式依靠了java的异常处理机制。)

    }
}
class Mythread08 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->begin");
        try {
            Thread.sleep(1000*60*60*24*265);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---->end");
    }
}