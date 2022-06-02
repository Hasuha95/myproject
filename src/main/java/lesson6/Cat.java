package lesson6;

public class Cat extends Animal {
    private static int catAmount;

    public Cat(String name, int restraction) {
        super(name, restraction);
        catAmount++;
    }


    public void runing(int x){
        if (x>restriction){
            System.out.println("Котик не может так далеко бежать :(");
        } else {
            System.out.println(name + " пробежал " + x + " метров");
        }
    }

    public static int getCatAmount() {
        return catAmount;
    }
}
