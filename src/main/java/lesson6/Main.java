package lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Animal catBarsick = new Cat("Барсик", 100);
        Animal dogTuzick = new Dog("Тузик", 500);

        catBarsick.runing(100);
        System.out.println(" ");
        dogTuzick.runing(500);

//        System.out.println(Animal.getAnimalsAmount());
//        System.out.println(Cat.getCatAmount());
//        System.out.println(Dog.getDogAmount());
    }



}
