public class ThreadTest10 {
    public static void main(String[] args) {
MyRunnable4 r=new MyRunnable4();
Thread t=new Thread(r);
t.setName("t");
t.start();                                                         //主线程睡五秒，同时分支执行了5秒 然后r.run 成了false ，结束
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run=false;
    }
}
 class  MyRunnable4 implements Runnable{
    boolean run=true;
     @Override
     public void run() {

         for(int i=0;i<10;i++){
             if(run) {
                 System.out.println(Thread.currentThread().getName() + i);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
             else{
                 return;
             }
         }
     }
 }