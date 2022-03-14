public class Organization {

    public static void main(String[] args) {
    // Create a Jhon class
        Jhon t1 = new Jhon();
        t1.start();
        // Create a Jhon class
        Mike t2 = new Mike();
        t2.start();
    // Create a Jhon class
        Sam t3 = new Sam();
        t3.start();

    }

}
class Jhon extends Thread{
    @Override
    public void run(){
        System.out.println("I am Jhon!!!"+Thread.currentThread().getName());
    }
}
class  Mike extends Thread{
    @Override
    public void run(){
        System.out.println("I am Mike!!");
    }
}
class Sam extends Thread{
    @Override
    public void run(){
        System.out.println("I am Sam!!!");
    }
}