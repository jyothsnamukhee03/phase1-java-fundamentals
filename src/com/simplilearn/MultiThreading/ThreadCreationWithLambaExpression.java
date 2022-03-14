public class ThreadCreationWithLambaExpression {
    public static void main(String[] args) {

        // create thread one
        Thread t1 = new Thread(() ->{
            System.out.println("Thread one is Running");
        });
        t1.start();
        // create thread two
        Thread t2 = new Thread(() ->{
            System.out.println("Thread Two is Running");
        });
        t2.start();
    }
}
