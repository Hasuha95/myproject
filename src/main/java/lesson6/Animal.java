package lesson6;

import java.util.Stack;

public class Animal {
    String name;
    private static int animalsAmount;

    public Animal(String name){
        this.name = name;
        animalsAmount++;
    }

    public static int getAnimalsAmount() {
        return animalsAmount;
    }

    public void runing(int h){
        System.out.println(name + " пробежал " + h + " метров");
    }

}
