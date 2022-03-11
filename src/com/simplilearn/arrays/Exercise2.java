
public class Exercise2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String [] ip = new String[5];

        // insert dta into email string array

        ip[0] = "192.168.11.13";
        ip[1] = "192.167.12.46";
        ip[2] = "10.10.10.10";
        ip[3] = "192.168.1.1";
        ip[4] = "255.255.255.0";

        // access data from the array

        System.out.println("Email at index 0 :> "+ip[0]);
        System.out.println("Email at index 3 :> "+ip[3]);

        System.out.println("---------------jyo-------------");

        // Access data with iteration

        for(int index=0;index < ip.length;index++) {
            System.out.println("Element at index "+ index+" :> "+ip[index]);
        }
    }
}
