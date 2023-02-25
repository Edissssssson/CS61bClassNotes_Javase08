package threadsafe3;
public class Account {
    private  String actno;
    private  double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public  synchronized void withdraw(double money){

            double before=this.getBalance();
            double after=before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);

        }
}
