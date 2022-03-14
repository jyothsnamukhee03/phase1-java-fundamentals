class Account{
    double balance = 1000.00;

    // show balance
    public  synchronized void  showBalance(){
        System.out.println("The Account Balance is "+balance);
    }

    // deposit
    public synchronized void deposit(double amount){
        System.out.println("Deposit Begins.........");
        balance += amount;
        System.out.println("Balamce: "+balance);
    }

    // withdraw
    public synchronized  void withdraw(double amount){
        if(balance < amount) {
            System.out.println("Invalid Amount");
        }
            try{
                wait(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("The balance is: "+balance);
    }
}

public class ThreadWithWaitDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        Thread t1 = new Thread(()->{
            acc.withdraw(5000);
        });
        Thread t2 = new Thread(()->{
            acc.deposit(100);
        });
        Thread t3 = new Thread(()->{
            acc.showBalance();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
