public class CompanyThread {
    public static void main(String[] args) {
    // create objects to bob
    Bob bob = new Bob();
    Thread t1 = new Thread(bob);
    t1.start();

    // create objects to bob
        Usman us = new Usman();
        Thread t2 = new Thread(us);
        t2.start();


    }
}
class Bob implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Bob is Running!!!");
    }
}

class Usman implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Usman is Running!!!");
    }
}
