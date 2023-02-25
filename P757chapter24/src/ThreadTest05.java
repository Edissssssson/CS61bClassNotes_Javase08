public class ThreadTest05 {
    public void doSome(){                                                      //等于doSome（）方法还是在线程main里运行呢
        String name=Thread.currentThread().getName();
        System.out.println("当前线程名字是："+name);
    }
    public static void main(String[] args) {
        ThreadTest05 threadTest05=new ThreadTest05();
        threadTest05.doSome();
        //这个代码出现在main方法当中，所以当前线程就是主线程。
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName());
        Mythread002 t=new Mythread002();
        t.setName("t1");
        System.out.println(t.getName());
        t.start();
        Mythread002 t2=new Mythread002();
        t2.setName("t2");
        System.out.println(t2.getName());
        t2.start();
    }
}
class Mythread002 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            //currentThread就是当前线程对象。当前线程是谁呢?
            // 当t1线程执行run方法，那么这个当前线程就是t1
            //当t2线程执行run方法，那么这个当前线程就是t2
            Thread currentThread=Thread.currentThread();
            System.out.println(currentThread.getName()+"分支线程"+i);
          //  System.out.println(this.getName()+"分支线程"+i);
           // System.out.println(super.getName()+"分支线程"+i);  用super this 也行，因为Mythread002正好是线程类，一般不这么用
        }
    }
}