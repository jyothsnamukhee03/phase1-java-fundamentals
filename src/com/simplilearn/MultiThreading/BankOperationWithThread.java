
class Customer{
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
        if(balance < amount){
            System.out.println("Invalid Amount");
        }else {
            System.out.println("Withdraw begins..........");
            balance -= amount;
            System.out.println("Th balance is: "+balance);
        }
    }
}

public class BankOperationWithThread {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Thread t1 = new Thread(()->{
            customer.withdraw(500);
        });
        Thread t2 = new Thread(()->{
            customer.deposit(10000);
        });
        Thread t3 = new Thread(()->{
            customer.showBalance();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
