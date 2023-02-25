public class HomeWork03 {
    public static void main(String[] args) {
        Mytime mytime =new Mytime(17,23,55);
        mytime.display();
        mytime.addHour(1);
        mytime.display();
        mytime.addSecond(1);
        mytime.display();
        mytime.addSecond(70);
        mytime.display();
        mytime.addMinute(37);
        mytime.display();
        mytime.addHour(1);
        mytime.display();
        mytime.addHour(3);
        mytime.display();
        mytime.addMinute(58);
        mytime.display();

    }
}
class Mytime {
    private int hour;
    private int minute;
    private int second;

    public Mytime() {
    }

    public Mytime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void display() {
        System.out.println("hour:" + getHour() + " minute:" + getMinute() + " second:" + getSecond());
    }

    public void addSecond(int sec) {
        int oldsecond=this.getSecond();
        int newsecond=oldsecond+ sec;
        if(newsecond ==60){
            this.addMinute(1);
            this.setSecond(0);
        }else if(newsecond>60){
            int add =newsecond/60;
            this.addMinute(add);
            this.setSecond(newsecond%60);
        }else{
            this.setSecond(newsecond);
        }
    }

    public void addMinute(int min) {
        int oldminute=this.getMinute();
        int newminute=oldminute+ min;
        if(newminute ==60){
            this.addHour(1);
            this.setMinute(0);
        }else if(newminute>60){
            int add =newminute/60;
            this.addHour(add);
            this.setMinute(newminute%60);
        }else{
            this.setMinute(newminute);
        }



    }

    public void addHour(int hou) {
        int oldhour=this.getHour();
        int newhour=oldhour+ hou;
        if(newhour ==24){
            this.setHour(0);
        }else if(newhour>24){
            int add =newhour/24;
            this.setHour(newhour%24);
        }else{
            this.setHour(newhour);
        }

    }

    public int subSecond(int sec) {
        this.setSecond(this.getSecond() - sec);
        return second;
    }

    public int subMinute(int min) {
        this.setMinute(this.getMinute() - min);
        return minute;
    }

    public int subHour(int hou) {
        this.setHour(this.getHour() - hou);
        return hour;
    }
}