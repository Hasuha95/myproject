package lesson7;

public class Plate {
    public String color;
    private int foodAmount;

    public Plate(String color, int foodAmount) {
        this.color = color;
        this.foodAmount = foodAmount;
    }


    public void food(int foodEating){
            foodAmount -= foodEating;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount){
        foodAmount+=amount;
    }
}
