import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws Exception {
        Timer timer=new Timer();
        //Timer timer=new Timer(true);  守护线程的方式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime=sdf.parse("2023-02-18 21:35:00");
      //  timer.schedule(new LogerTimer(),firstTime,1000*10); 每十秒执行一次
     // timer.schedule(new LogerTimer(),firstTime,1000*60*60*24*365); //每年执行一次
        timer.schedule(new TimerTask() {            //匿名内部类也可以
            @Override
            public void run() {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String strTime=sdf.format(new Date());
                System.out.println(strTime+"成功备份一次数据");
            }
        },firstTime,1000*10);
    }
}
//编写定时任务类 继承TimerTask
/*
class LogerTimer extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime=sdf.format(new Date());
        System.out.println(strTime+"成功备份一次数据");
    }
}*/
