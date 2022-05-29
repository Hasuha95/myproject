package lesson6;

public class Main {

    public static void main(String[] args){
        Animal catBarsick = new Cat("Барсик");
        Animal dogTuzick = new Dog("Тузик");

//        ((Cat)catBarsick).jamp();
//        catBarsick.runing(100);
//        System.out.println(" ");
//        ((Dog)dogTuzick).swiming(10);

        System.out.println(Animal.getAnimalsAmount());
        System.out.println(Cat.getCatAmount());
        System.out.println(Dog.getDogAmount());
    }



}
