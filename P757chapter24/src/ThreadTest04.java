
//匿名内部类的方式，直接new接口
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("分支线程"+i);
                }
            }
        });         //直接new +接口名，但实际接口不能new对象的，里面实现run（）方法
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("主线程"+i);
        }
    }
}
