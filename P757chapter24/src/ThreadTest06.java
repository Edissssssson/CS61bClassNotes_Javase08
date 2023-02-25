public class ThreadTest06 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Why are you happy?");
        for(int i=0;i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+i);
                Thread.sleep(1000*3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
