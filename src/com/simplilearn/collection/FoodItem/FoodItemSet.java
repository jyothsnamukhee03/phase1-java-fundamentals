
import java.util.HashSet;
import java.util.Set;

public class FoodItemSet {
    public static void main(String[] args) {

        Set<Food> foodSet = new HashSet<Food>();

        Food f1 = new Food(101, "Chicken Biryani", "Rice", "Lunch");
        Food f2 = new Food(102, "Burger", "Snack", "Evening");
        Food f3 = new Food(103, "panneer", "Curry", "Lunch");
        Food f4 = new Food(104, "Roti", "Tiffin", "Dinner");
        Food f5 = new Food(105, "Coffee", "Drink", "Morning");

        foodSet.add(f1);
        foodSet.add(f2);
        foodSet.add(f3);
        foodSet.add(f4);
        foodSet.add(f5);

        for( Food food : foodSet) {
            System.out.println(food.foodId);
            System.out.println(food.foodName);
            System.out.println(food.foodType);
            System.out.println(food.timeOfFood);
            System.out.println("-------------------------------");
        }

    }
}
