public class Calculator {

    public static void main(String[] args) {

        final int A=10;
        final int B=20;
        final int C=30;
        double D=A;

        System.out.println("Double value "+D);

        System.out.println ("Sum is: "+(A+B));
        System.out.println ("Sub is: "+(B-C));
        System.out.println ("Division: "+(C/D));
        System.out.println ("Multiplication: "+(D*A));

        for(int i=5; i >=1; i --) {
            if (i ==2 )
                break;
            System.out.println("Value of i :"+i);
        }

    }

}