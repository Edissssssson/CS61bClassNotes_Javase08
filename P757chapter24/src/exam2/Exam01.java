//问doOther（）方法执行时需不需要等待doSome（）方法结束
package exam2;
public class Exam01 {
    public static void main(String[] args) {
    Myclass mc=new Myclass();
    Thread t1=new Mythread(mc);     //t1 t2 线程共享mc这一个对象
    Thread t2=new Mythread(mc);
    t1.setName("t1");
    t2.setName("t2");
    t1.start();
        try {
            Thread.sleep(1000);    //为了保证t1线程先执行，所以t2执行前先睡一秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class Mythread extends Thread{
    private Myclass mc;

    public Mythread(Myclass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
if(Thread.currentThread().getName().equals("t1")){mc.doSome();}
if(Thread.currentThread().getName().equals("t2")){mc.doOther();}
    }
}

class Myclass {
    public synchronized  void doSome(){
        System.out.println("doSome begins");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome ends");
    }
    public synchronized  void doOther(){
        System.out.println("doOther begins");
        System.out.println("doOther ends");
    }
}

