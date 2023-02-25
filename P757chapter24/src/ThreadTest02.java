public class ThreadTest02 {
    public static void main(String[] args) {     //main方法。这里代码属于主线程，应该说这类中都在主线程中
Mythread mythread=new Mythread();            //创建线程对象
        mythread.run();
        mythread.start();                                               //启动线程 ，开出分支栈，瞬间就结束，然后主栈与分支栈 for循环同时进行
        for(int i =0;i<1000;i++){                               ///这里for循环代码还是运行在主线程中
            System.out.println("主线程---->"+i);
        }
    }
}
//编写程序，这段程序运行在分支线程中（分支栈)。
class Mythread extends Thread{
    @Override
    public void run() {
        for(int i =0; i<1000;i++){
            System.out.println("分支线程---->"+i);
        }
    }
}