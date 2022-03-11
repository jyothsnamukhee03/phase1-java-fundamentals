

public class Food {
    public int foodId;
    public String foodName;
    public String foodType;
    public String timeOfFood;

    public Food(int foodId, String foodName, String foodType, String timeOfFood) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodType = foodType;
        this.timeOfFood = timeOfFood;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", timeOfFood='" + timeOfFood + '\'' +
                '}';
    }
}
