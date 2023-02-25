import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
//本例子用的是匿名内部类的方式
public class ThreadTest15 {
    public static void main(String[] args) throws  Exception {
//创建未来任务对象
        //参数很重要，给一个Callable接口实现类对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {           //call 方法相当于run方法，只不过是有返回值
                System.out.println("call method begin");
                try {
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;      //300结果自动装箱变integer
            }
        });
        Thread t = new Thread(futureTask);  //创建线程对象t 把futureTask传进去，相当于这一行与上面new Callable都是除主线程以外的线程
        t.start();
        Object obj = futureTask.get();
        //main方法这里的程序要想执行必须等待get()方法的结束
        //而get( )方法可能需要很久。因为get()方法是为了拿另一个线程的执行结果
        // 另一个线程执行是需要时间的。
        System.out.println("线程执行结果"+obj);
        System.out.println("Hello");

    }
}

