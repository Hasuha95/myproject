package lesson6;

public class Dog extends Animal {
    private static int dogAmount;

    public Dog(String name, int restriction) {
        super(name, restriction);
        dogAmount++;
    }

    public void runing(int x){
        if (x>restriction){
            System.out.println("Пёсик не может бежать " + x + " метров" + " это слишком далеко для него :(");
        } else {
            System.out.println(name + " пробежал " + x + " метров");
        }
    }

    public void swiming(int l){
        if (l>10){
            System.out.println("Слишком далеко! Пёсик может утонуть :(");
        } else {
            System.out.println(name + " проплыл " + l + " метров");
        }
    }

    public static int getDogAmount() {
        return dogAmount;
    }
}
