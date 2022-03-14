public class ExceptionHandling {
    public static void main(String[] args) {
        strLengthCalculator("Jyothsna");
        strLengthCalculator(null);
        strLengthCalculator("JyothsnaJanu");
        System.out.println("----------------------------");
        transaction(30);
        transaction(0);
        transaction(50);
        System.out.println("------------------------");
        StringtoNumber("1233");
        StringtoNumber("ahfd");
    }
    private static void strLengthCalculator(String str){
        try {
            int length = str.length();
            System.out.println("String Length: " + length);
        }catch (NullPointerException e){
            System.out.println("Exception occurs: "+e.getClass());
            System.out.println("Exception Message: "+e.getMessage());
        }
    }
    private static void transaction(int amount){
        try {
            double balance = 3000;
            double result = balance / amount;
            System.out.println("The result is: " + result);
        }catch (ArithmeticException e){
            System.out.println("Exception occurs: "+e.getClass());
            System.out.println("Exception Message: "+e.getMessage());
        }
    }
    private static void StringtoNumber(String num){
        try{
            int result = Integer.parseInt(num);
            System.out.println("The number is "+result);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
}
