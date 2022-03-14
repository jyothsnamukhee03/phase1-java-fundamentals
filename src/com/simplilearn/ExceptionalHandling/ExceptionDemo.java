public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Program Started...........");
            int balance = 1000;
            int amount = 0;
            int result = balance / amount;
            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e){
            System.out.println(e.getClass());
        }finally {
            System.out.println("Always running block");
        }
        System.out.println("Program was terminated");
    }
}
