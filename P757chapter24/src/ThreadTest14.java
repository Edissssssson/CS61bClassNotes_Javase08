public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t1=new BakDataThread();
        t1.setName("备份线程");
        t1.setDaemon(true);           //setDaemon(true) 设置t1为守护线程
        t1.start();
        //主线程里for循环
        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (true){            //死循环
            System.out.println(Thread.currentThread().getName()+"----->"+(++i));
        }
    }
}