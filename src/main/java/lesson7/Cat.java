package lesson7;

public class Cat {
    private String name;

    private boolean satiety;
    private int foodEating;

    public Cat(String name, boolean satiety, int foodEating) {
        this.name = name;
        this.foodEating=foodEating;
        this.satiety = satiety;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public int getFoodEating() {
        return foodEating;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.getFoodAmount()>=foodEating){
            plate.food(foodEating);
            satiety=true;
            System.out.println(name + " ate from " + plate.color + " plate.");
        } else {
            System.out.println("The " + plate.color + " plate can't contain amount of food less then a cat can eat ");
        }
    }
}
