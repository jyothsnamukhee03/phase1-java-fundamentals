
public class ThreadDemo extends Thread {
    public static void main(String[] args) {

        // Create the Thread Object
        ThreadDemo td = new ThreadDemo();
        // start the thread
        td.start();

    }

    @Override
    public void run(){
    // Thread processing logic
        System.out.println("The Main Thread is Running");

    }

}
