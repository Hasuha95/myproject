package lesson6;

public class Cat extends Animal {
    private static int catAmount;

    public Cat(String name) {
        super(name);
        catAmount++;
    }


    public void runing(int x){
        if (x>200){
            System.out.println("Котик не может так далеко бежать :(");
        } else {
            System.out.println(name + " пробежал " + x + " метров");
        }
    }

    public void jamp(){
        System.out.println(name + " jumped");
    }

    public static int getCatAmount() {
        return catAmount;
    }
}
