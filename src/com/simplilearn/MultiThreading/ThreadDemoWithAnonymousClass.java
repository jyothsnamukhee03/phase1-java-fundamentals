public class ThreadDemoWithAnonymousClass {
    public static void main(String[] args) {
        //create object of usman
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Usman Is Runninbg!!!");
            }
        });
        t1.start();

        // create thread for Bob
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Bob Is Runninbg!!!");
            }
        });
        t2.start();
    }
}
