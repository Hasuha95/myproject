package lesson6;

import java.util.Random;
import java.util.Stack;

public class Animal {

    String name;
    int restriction;

    private static int animalsAmount;

    public Animal(String name, int restriction){
        this.name = name;
        this.restriction = restriction;
//        this.restriction=restrictions;
        animalsAmount++;
    }

    public static int getAnimalsAmount() {
        return animalsAmount;
    }

    public void runing(int h){

        System.out.println(name + " пробежал " + h + " метров");
    }

}
