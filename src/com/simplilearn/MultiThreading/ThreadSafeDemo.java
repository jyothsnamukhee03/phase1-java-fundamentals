class Counter{
    int count;

    // increase count
    public void increaseCount(){
        count++;
    }


    // decrease count
    public void decreaseCount(){
        count--;
    }

}


public class ThreadSafeDemo {
    public static void main(String[] args) throws InterruptedException{

        // create counter objectr
        Counter counter = new Counter();

        // create thead one
        Thread t1 = new Thread(() ->{
           for(int index = 0;index < 10000;index++ ){
               counter.increaseCount();
           }
        });
        t1.start();
        System.out.println("The counter increment is: "+counter.count);
        t1.join();
        System.out.println("Updated is: "+counter.count);
    }
}
