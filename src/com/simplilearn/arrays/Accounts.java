public class Accounts {
    public int accid;
    public String acctype;
    public double balance;

    // Accounts Constructor

    public Accounts(int accid, String acctype, double balance) {
        this.accid = accid;
        this.acctype = acctype;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Accounts [accid=" + accid + ", account type =" + acctype + ", balance =" + balance + "]";
    }

}
