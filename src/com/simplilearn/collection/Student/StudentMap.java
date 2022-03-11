import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {

    public static void main(String[] args) {

        Map<String, Double> studentitems = new LinkedHashMap<String, Double>();
        studentitems.put("Jyothsna", 76.99);
        studentitems.put("Anusha", 64.93);
        studentitems.put("Pratyusha", 98.3);
        studentitems.put("Vishrutha", 65.45);
        studentitems.put("Kavya", 75.56);
        studentitems.put("Prasuna", 99.56);

        System.out.println(studentitems);

        System.out.println("Jyothsna Total Marks:" + studentitems.get("Jyothsna"));
        System.out.println("Kavya Total Marks :" + studentitems.get("Kavya"));

        // iterate over map
        for (Map.Entry<String, Double> entry : studentitems.entrySet()) {
            System.out.println(" Key : " + entry.getKey());
            System.out.println(" Value : " + entry.getValue());
            System.out.println("--------------");
        }

    }

}
