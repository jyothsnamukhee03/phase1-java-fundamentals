
public class Exercise1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Float[] price = new Float[5];

        // insert dta into email string array

        price[0] = (float)10000.52;
        price[1] = (float)5398.1574;
        price[2] = (float)4987.684;
        price[3] = (float)5644987.684; // converted double  to float
        price[4] = (float)498567.6584; // converted double to float

        // access data from the array

        System.out.println("Email at index 0 :> "+price[0]);
        System.out.println("Email at index 3 :> "+price[3]);

        System.out.println("---------------jyo-------------");

        // Access data with iteration

        for(int index=0;index < price.length;index++) {
            System.out.println("Element at index "+ index+" :> "+price[index]);
        }
    }
}
