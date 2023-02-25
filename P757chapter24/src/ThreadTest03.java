public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t=new Thread(new Mythread03());
        t.start();
        for(int i = 0; i<100; i++){
            System.out.println("主线程"+i);
        }
    }
}
class Mythread03 implements  Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("分支线程"+i);
        }
    }
}