public class ThreadTest09 {
    public static void main(String[] args) {
Thread t=new Thread(new MyRunnable());
t.setName("t");
t.start();
        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();
    }
}
class  MyRunnable  implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//t0
//t1
//t2
//t3
//t4
//
//Process finished with exit code 0 